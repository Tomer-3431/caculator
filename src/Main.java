// notes: 
// I use Double instead of Integer
// and added % to the operations

public class Main {
    public static void main(String[] args) {
        // input operation
        String operation = System.console().readLine("enter a operation");
        // input first number
        double num1 = Double.parseDouble(System.console().readLine("enter ur first num: "));
        // input second number
        double num2 = Double.parseDouble(System.console().readLine("enter ur sec num: "));

        // check for wich operation and then print the equation
        // check if operaion is +
        if (operation.equals("+")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + (num1+num2));
            // check if operation is -
        } else if (operation.equals("-")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + (num1-num2));
            // check if operation is *
        } else if (operation.equals("*")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + (num1*num2));
            // check if operation is /
        } else if (operation.equals("/")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + (num1/num2));
            // check if operation is ^
        } else if (operation.equals("^")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + Math.pow(num1,num2));
            // check if opeartion is %
        } else if (operation.equals("%")){
            System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + (num1%num2));
            // if not one of the var operation is none of the above then send operation wasn't found and close the code 
        } else {
            System.out.println("operation wasn\'t found");
        }
    }
}
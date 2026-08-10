import java.util.Scanner;

public class Main{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter the 1st number:");
        num1 = sc.nextDouble();

        System.out.print("Choose an operator (+,-,*,/,^) :");
        operator = sc.next().charAt(0);

        System.out.print("Enter the 2nd number:");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperator = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid Operator!");
                validOperator = false;
            }
        }

        if(validOperator) {
            System.out.println(result);
        }

        sc.close();
    }
}

import  java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("choose the operator '+,-,*,/,^' : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+'-> result= num1 + num2;
            case '-' -> result= num1 - num2;
            case '*' -> result= num1 - num2;
            case '/' ->  {
                    if(num2==0){
                        System.out.print("cannot be divided by zero");
                        validOperation = false;
                    }
                    else {
                        result= num1 - num2;
            }

            }
            case '^' -> result= Math.pow(num1, num2);

            default ->
                    {
                        System.out.print("The Operation is invalid");
                        validOperation = false;
                    }
        }
        if(validOperation) {
            System.out.print(result);
        }


    }
}

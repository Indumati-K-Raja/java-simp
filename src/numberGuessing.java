import java.util.Random;
import java.util.Scanner;
public class numberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("              Number guessing game         ");

        System.out.printf("Enter the number between %d-%d  \n", min, max);


       do {
            System.out.println("Enter the guess:");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW !, TRY AGAIN");
           } else if (guess>randomNumber) {
                System.out.println("TOO HIGH !, TRY AGAIN");
            }else {
                System.out.println("You are CORRECT!");
            }


       } while (guess != randomNumber);

        System.out.println("No of Attempts: "+ attempts);

        scanner.close();
    }
}

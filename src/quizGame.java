import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
                "Indu is your?",
                "Indu likes tea or coffee?",
                "Indu is a?"
        };

        String[][] options = {
                {"1. Friend", "2. Love", "3. Enemy"},
                {"1. Coffee", "2. Tea", "3. None"},
                {"1. Good Girl", "2. Bad Girl", "3. Sweet Girl"}
        };

        int[] answers = {1, 2, 3}; // Correct answers
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in); // Only one Scanner

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess (1-3): ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("✅ You are correct!");
                score++;
            } else {
                System.out.println("❌ You are wrong!");
            }

            System.out.println("Current score: " + score + "/" + (i + 1));
        }

        scanner.close();
        System.out.println("\nFinal Score: " + score + " out of " + questions.length);
    }
}

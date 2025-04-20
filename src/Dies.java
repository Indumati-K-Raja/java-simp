import java.util.Scanner;
import java.util.Random;
public class Dies {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

        int numDies;
        int total =0;

        System.out.print("Enter the number of dies you want to roll: ");
        numDies = scanner.nextInt();

        System.out.println(numDies);

        if(numDies > 0){
            for( int i= 0; i< numDies; i++) {
                int randDie = random.nextInt(1, 7);

                System.out.println("You have Rolled: "+ randDie);
                printDies(randDie);
                total += randDie;
                //System.out.println("Total: "+ total);
                System.out.println("--------------------");
            }
        }
        else{
            System.out.print("Roll is invalid");
        }

        System.out.println("Total: "+ total);
        scanner.close();


    }
    static  void printDies(int ranDie){
        String die1 = """
                ------
               |      |
               |   ●  |
               |      | 
                ------
               
                """;
        String die2 = """
                ------
               | ●    |
               |      |
               |    ● | 
                ------
               
                """;
        String die3 = """
                ------
               | ●    |
               |   ●  |
               |     ●| 
                ------
               
                """;
        String die4 = """
                ------
               | ●  ● |
               |      |
               | ●  ● | 
                ------
               
                """;
        String die5 = """
                ------
               | ●   ● |
               |   ●   |
               | ●   ● | 
                ------
               
                """;
        String die6 = """
                ------
               | ●   ● |
               | ●   ● |
               | ●   ● | 
                ------
               
                """;
        switch (ranDie){
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
            default -> System.out.print("Invalid rolls bruh!");
        }

    }




}

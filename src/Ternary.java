import java.util.Scanner;

public class Ternary {
    public static void main(String[] agrs){
        Scanner scanner= new Scanner(System.in);

        double temperature;
        double newTemperature;
        String unit;

        System.out.print("Enter the Temperature:");
        temperature = scanner.nextDouble();

        System.out.print("Enter how to convert (C or F) :");
        unit =  scanner.next().toUpperCase();

        newTemperature=(unit.equals("C")) ? (temperature-32)*5/9 : (temperature* 9/5) +32;

        System.out.printf("% .2f° %s",newTemperature,unit);

        scanner.close();

    }
}

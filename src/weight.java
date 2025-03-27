import java.util.Scanner;
public class weight {
    public static void main (String[] args){
    Scanner scanner= new Scanner(System.in);
    int choice;
    double weight;
    double newWeight;

        System.out.println(" Weight Converter ");

        System.out.println("1. lbs to kgs");
        System.out.println("2. kgs to lbs");


        System.out.print("Enter Your choice : ");
        choice= scanner.nextInt();

       if(choice==1){
           System.out.print("Enter the weight in lbs \n");
            weight = scanner.nextDouble();
            newWeight= weight * 0.453592;
           System.out.println("The new weight is converted from lbs to kgs is : " + newWeight);

        } else if (choice==2) {
           System.out.print("Enter the weight in kgs \n");
           weight = scanner.nextDouble();
           newWeight= weight * 2.20462;
           System.out.printf("The new weight is converted from kgs to lbs is :%.2f", newWeight);



       }
       else{
           System.out.println("Enter the vaild choice");
       }
    scanner.close();
    }
}

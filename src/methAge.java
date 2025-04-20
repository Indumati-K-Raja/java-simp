import java.util.Scanner;
public class methAge {
    public static void main(String [] args){
        int age;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your age: ");
        age= scanner.nextInt();

        if(checkAge(age)){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("you are not eligible");
        }
    }
    static boolean checkAge(int age){
        if(age>=18){
            return  true;
        }
        else {
            return  false;
        }
    }
}

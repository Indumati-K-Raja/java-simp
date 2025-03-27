import java.util.Scanner;
class hello{
    public static void main (String[] args)
    {
    Scanner name = new Scanner(System.in);
    System.out.print("enter the number:");
    int a = name.nextInt();
    if (a%2==0)
    {
        System.out.print("the number is even:"+a);
    }
    else
    {
        System.out.print("the number is odd:"+a);
    }
    }
}

//additon of two numbers taken input from user
import java.util.Scanner;

public class program3 {
    public static void main(String[]args)
    {
        Scanner sobj = new Scanner(System.in);
        int A = 0,B=0, C=0;

        System.out.println("Enter the Values you to do addition  : ");
       A =  sobj.nextInt();

       B=   sobj.nextInt();


        C = A+B;






        System.out.print("the Name you enter to print is  : " +C);
    }
}
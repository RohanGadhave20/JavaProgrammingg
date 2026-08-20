import java.util.Scanner;

public class program2 {
    public static void main(String[]args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name you want to print : ");


        String sName=sobj.next();
        System.out.print("the Name you enter to print is  : " +sName);
    }
}

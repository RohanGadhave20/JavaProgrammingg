//basic calculator program using if else 
package src;

import java.util.Scanner;

public class program4 {

    public static void main(String A[])
    {
        System.out.println("welcome User to Experience CUI Based Calculator\n");
        System.out.println("For Addition press : 1\n");
        System.out.println("For Substraction press : 2\n");
        System.out.println("For Multiplication press : 3\n");
        System.out.println("For Division press : 4\n");

        System.out.println("enter the number you want to perform operation : ");
        Scanner sobj = new Scanner(System.in);
        int iUserIp = 0;
        iUserIp = sobj.nextInt();
        int iInput1 = 0;
        int iInput2 = 0;
        int iOutput = 0;
        if(iUserIp < 1 || iUserIp > 4) 
        {
            System.out.println("please enter valid number for doing operation  ");
            
        }
        else if(iUserIp == 1)
        {
            System.out.println("for doing addition enter the two number : \n");
            iInput1 = sobj.nextInt();
            iInput2 = sobj.nextInt();
        }
         else if(iUserIp == 2)
        {
            System.out.println("for doing substraction enter the two number : \n");
            iInput1 = sobj.nextInt();
            iInput2 = sobj.nextInt();
        }
         else if(iUserIp == 3)
        {
            System.out.println("for doing multiplication enter the two number : \n");
            iInput1 = sobj.nextInt();
            iInput2 = sobj.nextInt();
        }
         else if(iUserIp == 4)
        {
            System.out.println("for doing division enter the two number : \n");
            iInput1 = sobj.nextInt();
            iInput2 = sobj.nextInt();
        }

        System.out.println("the two number is : " +iInput1+" "+iInput2 );


        if(iUserIp == 1 )
        {
            iOutput = iInput1+iInput2;
            System.out.println("Addition of two number is : " +iOutput);


        }
        else if(iUserIp == 2)
        {
            iOutput = iInput1 - iInput2;
            System.out.println("Substraction of two number is : " +iOutput);
            
        }
         else if(iUserIp == 3)
        {
            iOutput = iInput1 * iInput2;
            System.out.println("Multiplication of two number is : " +iOutput);
            
        }
         else if(iUserIp == 4)
        {
            iOutput = iInput1/iInput2;
            System.out.println("Division of two number is : " +iOutput);
            
        }







    }

    
}

package a6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try {

            int num1, num2, num;
            Scanner a = new Scanner(System.in);


            System.out.print("Enter first number : ");
            num1 = a.nextInt();

            System.out.print("Enter second number : ");
            num2 = a.nextInt();


            num = num1 / num2;
            System.out.println("Result:" + num);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error UnsupportedOperationException"+e);
        }
    }

}

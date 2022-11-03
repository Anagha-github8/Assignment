package a1;
import java.util.Scanner;

public class simpleAndcompundInterest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the principle ");
        double principal = a.nextDouble();
        System.out.println("Enter the rate ");
        double rate = a.nextDouble();
        System.out.println("Enter the time ");
        double time = a.nextDouble();
        System.out.print("Enter number of times interest is compounded: ");
        int number = a.nextInt();

        double sinterest = (principal * time * rate) / 100;
        double cinterest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;

        System.out.println("simple interest " + sinterest);
        System.out.println("compound interest " + cinterest);

    }
}

//program to find the average of six numbers
import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = s.nextInt();
        System.out.print("Enter the second number:");
        num2 = s.nextInt();
        System.out.print("Enter the third number:");
        num3 = s.nextInt();
        System.out.print("Enter the fourth number:");
        num4 = s.nextInt();
        System.out.print("Enter the fifth number:");
        num5 = s.nextInt();
        System.out.print("Enter the sixth number:");
        num6 = s.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5 + num6;
        int average = sum/6;
        System.out.println("Average number:"+average);
    }
}

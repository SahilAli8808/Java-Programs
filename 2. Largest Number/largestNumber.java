//program to find the largest number among three numbers
import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = s.nextInt();
        System.out.print("Enter the second number:");
        num2 = s.nextInt();
        System.out.print("Enter the third number:");
        num3 = s.nextInt();
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Largest number:"+num1);
        }
        else if(num2 > num1 && num2 > num3)
        {
            System.out.println("Largest number:"+num2);
        }
        else
        {
            System.out.println("Largest number:"+num3);
        }
    }
}

//program to create a simple calculator
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = s.nextInt();
        System.out.print("Enter the second number:");
        num2 = s.nextInt();
        System.out.println("Choose any one of the following options:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice:");
        int choice = s.nextInt();
        switch(choice) {
            case 1:
                int sum = num1 + num2;
                System.out.println("Sum of the numbers:"+sum);
                break;
            case 2:
                int difference = num1 - num2;
                System.out.println("Difference of the numbers:"+difference);
                break;
            case 3:
                int product = num1 * num2;
                System.out.println("Product of the numbers:"+product);
                break;
            case 4:
                int quotient = num1 / num2;
                System.out.println("Quotient of the numbers:"+quotient);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
//
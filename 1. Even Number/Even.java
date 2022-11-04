
//program to find n even numbers
import java.util.Scanner;

public class Even {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
    }
}



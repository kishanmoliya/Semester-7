//W.A.P. to check given number is odd or even using bitwise operator.

import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println(n ^ 1);
        if ((n ^ 1) == (n + 1)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}

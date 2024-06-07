// Accept a positive number from the user and print a message stating whether the number 
// entered is even or odd WITHOUT using the module (%)operator and if... else statements.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        String ans = (n / 2) * 2 == n ? "Even" : "Odd";

        System.out.println(n + " is " + ans);
    }
}

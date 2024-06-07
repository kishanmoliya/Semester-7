// Accept two integers from the user and calculate the sum of last digits of both the integers. For
// example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).

import java.util.*;
public class LastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num 1: ");
        int x = sc.nextInt();
        System.out.print("Enter the num 2: ");
        int y = sc.nextInt();

        System.out.print("LastDigit: " + (x % 10) + (y % 10));
    }
}

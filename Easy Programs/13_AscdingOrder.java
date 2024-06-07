//Accept three integer values from the user and display them in ascending order using only 
//operators (i.e. without using if…else, switch case, or loop).

import java.util.Scanner;

public class AscdingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the num 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the num 3: ");
        int c = sc.nextInt();

        int num1 = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
        int num3 = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        int num2 = (a + b + c) - (num1 + num3);

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}

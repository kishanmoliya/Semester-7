//Create a program that would accept a string from the user and print a pattern. For example, if
//the user enters “Hello”, it should print a pattern as follows:
// H
// He
// Hel
// Hell
// Hello

import java.util.Scanner;

public class StringPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String n = sc.next();

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}
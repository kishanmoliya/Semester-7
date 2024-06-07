import java.util.*;
public class MaximumBetweenThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the Number 3: ");
        int c = sc.nextInt();

        int ans = (a > b && a > c) ? a : b > c ? b : c;
        System.out.println("Maximum : " + ans);
    }
}
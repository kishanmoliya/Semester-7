import java.util.Scanner;

public class Trailing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int count = 0;
        while(n > 0){
            n = n / 5;
            count += n;
        }

        System.out.println(count);
    }
}

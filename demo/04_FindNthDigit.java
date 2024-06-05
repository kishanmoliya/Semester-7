import java.util.Scanner;

public class FindNthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        String str = "";
        for(int i=1; i<=n; i++){
            str += i;
        }

        System.out.println(str.charAt(n-1));
    }
}

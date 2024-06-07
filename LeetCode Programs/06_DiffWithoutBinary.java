import java.util.Scanner;

public class DiffWithoutBinary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Value: ");
        int num2 = sc.nextInt();

        int count = 0;
        while (num1 > 0 || num2 > 0) {
            if(num1 % 2 != num2 % 2){
                count++;
            }

            num1 /= 2;
            num2 /= 2;
        }

        System.out.println(count);
    }
}


import java.util.Scanner;

public class JumpGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int n = sc.nextInt();

        //  int[] arr = {2,3,1,1,4,3,2,1,0,4,0,0,0,4,2,3,1,6};
        // int[] arr = {4,0,1,2,3};
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.err.print("Enter the " + (i + 1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = arr.length - 1; i > 0; i--) {
            int j = i - 1;
            System.out.println(i + " " + j);
            while (arr[j] < i - j) {
                if (arr[j] >= i - j) {
                    System.err.println("OK");
                    i -= j + 1;
                    break;
                }

                if (arr[j] <= i - j) {
                    System.err.println("OK2");
                    j--;
                }

                if (j == -1) {
                    System.err.println("OK3");
                    System.out.println("FALSE");
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }

        if (flag) {
            System.out.println("TRUE");
        }
    }
}

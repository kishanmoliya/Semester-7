import java.util.Scanner;

public class Pelindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of num : ");
        int num = sc.nextInt();

        System.out.println(isPelindrom(num));
    }

    public static boolean isPelindrom(int num){
        int count = num;

        int n = 0; //121
        while(count > 0){
            int temp = count % 10;
            n = n* 10 + temp;
            count /= 10;           
        }

        return n == num ? true : false;
    }
}

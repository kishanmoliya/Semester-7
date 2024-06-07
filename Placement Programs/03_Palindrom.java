import java.util.*;
public class MaximumBetweenThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();
       
        int num = n;
        int palindrom = 0;
        while(num > 0){
            int temp = num % 10;
            palindrom = palindrom * 10 + temp;
            num /= 10;
        }

        if(n == palindrom){
            System.out.println(palindrom + " is Palindrom");
        }else{
            System.out.println(palindrom + " is not Palindrom");
        }
    }
}
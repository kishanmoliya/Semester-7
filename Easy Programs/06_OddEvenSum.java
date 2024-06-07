// W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers
import java.util.*;
public class Series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int odd = 0, even = 0;
        for(int i=0; i<n; i++){
            System.out.print("Enter the Value of " + i+1 + "  Element: ");
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        
        System.out.println("Even Sum: " + even + "\nOdd Sum: " + odd);
    }
}
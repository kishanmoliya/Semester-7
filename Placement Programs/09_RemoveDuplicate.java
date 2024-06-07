// W.A.P. to read n numbers in an array and remove the duplicates from an array.
import java.util.*;
public class Series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the Value of " + (i+1) + "  Element: ");
            arr[i] = sc.nextInt();
        }
        
        int duplicates[] = new int[n];
        for(int i=0; i<n; i++){
            duplicates[arr[i] - 1] = arr[i];
        }

        for(int i=0; i<n; i++){
            if(duplicates[i] != 0){
                System.out.print(i+1 + " ");
            }
        }
    }
}
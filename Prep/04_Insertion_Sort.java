import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();        
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the value of " + (i+1) + " Element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(insertion_Sort(arr)));
    }

    public static int[] insertion_Sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

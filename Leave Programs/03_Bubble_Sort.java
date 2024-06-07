import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();        
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the value of " + (i+1) + " Element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(bubble_Sort(arr)));
    }

    public static int[] bubble_Sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

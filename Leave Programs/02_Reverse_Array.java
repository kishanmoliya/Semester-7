import java.util.*;
class Reverse_Array{
    public static void main(String[] args) {
        int[] arr = {45,56,32,58};
        int n = arr.length;

        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
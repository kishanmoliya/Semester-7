// Problem Statement: Write a program to find the kth largest element in an unsorted array.
// Input: [3, 2, 1, 5, 6, 4], k = 2
// [3, 2, 1, 5, 6, 4], k = 4
// Output: 5
// 3

import java.util.Arrays;

public class K_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 4;

        System.out.println(findLargest(arr, k));
    }

    public static int findLargest(int[] arr, int k){
        Arrays.sort(arr);
        return arr.length - k + 1;
    }
}

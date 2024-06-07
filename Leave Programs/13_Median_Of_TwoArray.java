// Problem Statement: Write a program to find the median of two sorted arrays.
// Input: nums1 = [1, 3]
// nums2 = [2]
// nums1 = [1, 2]
// nums2 = [3, 4]

// Output:
// 2.0
// 2.5

public class Median_Of_TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        System.out.println(findMedian(arr1, arr2));
    }

    public static double findMedian(int[] arr1, int[] arr2){
        double temp1 = getMedian(arr1);
        double temp2 = getMedian(arr2);

        double median = (temp1 + temp2) / 2;

        return median;
    }

    public static double getMedian(int[] arr){
        int n = arr.length;
        if(n % 2 == 0){
            double num1 = arr[(n / 2) - 1];
            double num2 = arr[(n / 2)];
            double ans = (num1 + num2) / 2;
            return ans;
        }else{
            double ans = arr[(n-1) / 2];
            return ans;
        }
    }
}

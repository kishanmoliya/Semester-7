// Given an array of N integers. Find the elements that appear more than N/3
// times in the array. If no such element exists, return an empty vector.
// import java.util.*;
// import java.io.*;

// public class baki {
//     public static void main(System[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Array : ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         HashMap<Integer, Integer> mapp = new HashMap<>();
//         for(int i=1; i<=n; i++){
//             if(map.containsKey(arr[i])){
//                 int temp = map.get(arr[i]);
//                 map.put(arr[i], ++temp);
//             }else{

//                 map.put(arr[i], 1);
//             }
//         }
//     }

//     public static Vector<Integer> majority_Ele(int[] arr){
//         int n = arr.length;

//         Vector<Integer> v = new Vector<Integer>(n);
//         return v;
//     }
// }

import java.util.*;

public class baki {
    public static List<Integer> majorityElement(int[] v) {
        int n = v.length; // size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers
        // declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // least occurrence of the majority element:
        int mini = (int) (n / 3) + 1;
        // storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
            // checking if v[i] is
            // the majority element:
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2)
                break;
        }
        return ls;
    }

    public static void main(String args[]) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
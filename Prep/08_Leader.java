// Given an array, print all the elements which are leaders. A Leader is an
// element that is greater than all of the elements on its right side in the array.

import java.util.*;
public class Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Enter the Element of array " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(get_Leaders(arr));
    }

    public static ArrayList<Integer> get_Leaders(int[] arr){
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int leader = 0;
        for(int i=0; i<arr.length; i++){
            if(leader < arr[i]){
                leader = arr[i];
                leaders.add(leader);
            }
        }
        return leaders;
    }
}

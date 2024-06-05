
public class FindMinimum {
    public static void main(String[] args) {
        // // Scanner sc = new Scanner(System.in);
        // // System.out.print("Enter the length of Array: ");
        // // int n = sc.nextInt();

        //     int[] arr = {3,4,5,1,2};
        // // int[] arr = new int[n];
        // int min = Integer.MAX_VALUE;
        // for(int i=0; i<n; i++){
        //     System.err.print("Enter the " + (i+1) + " Element: ");
        //     arr[i] = sc.nextInt();
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }

        // System.err.println("Minimum Element: " + min);


        //int[] arr = {9,10,0,1,2,3,4,5,6,7,8};
        //int[] arr = {6,7,45,48,49,95,100,123,-45,-2,1};
        int[] arr = {11,13,15,17};

        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int mid = s + ((e - s) / 2);
        
            if(Math.abs(s-e) == 1){
                System.out.println(arr[s] < arr[e] ? arr[s] : arr[e]);
                break;
            }

            if(mid == s || mid == e){
                System.out.println(arr[mid]);
                break;
            }

            if(Math.abs(arr[mid] - arr[s]) > Math.abs(arr[mid] - arr[e])){
                e = mid;
                mid = s + ((e - s) / 2);;
            }else{
                s = mid;
                mid = s + ((e - s) / 2);;
            }
        }
    }
}


public class FindMinimum {
    public static void main(String[] args) {
        //int[] arr = {9,10,0,1,2,3,4,5,6,7,8};
        int[] arr = {6,7,45,48,49,95,100,123,-45,-2,1};
        //int[] arr = {11,13,15,17};

        int s = 0;
        int e = arr.length-1;
        while(true){
            int mid = s + ((e - s) / 2);
        
            if(s == e){
                System.out.println(arr[s]);
                break;
            }

            if(arr[mid] < arr[e]){
                e = mid;
                mid = s + ((e - s) / 2);;
            }else{
                s = mid + 1;
                mid = s + ((e - s) / 2);;
            }
        }
    }
}

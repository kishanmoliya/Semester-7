public class Find_Target {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 0; //5 2 7 0

        int i=0;
        boolean flage = true;
        while(i <= target && i < arr.length-1){
            if(arr[i] == target){
                System.out.println(i);
                flage = false;
                break;
            }else if(arr[i] > target){
                System.out.println(i);
                flage = false;
                break;
            }
            i++;
        }

        if(flage){
            System.out.println(arr.length);
        }
    }
}

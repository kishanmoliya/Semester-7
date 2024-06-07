public class jumpGame {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};

        boolean flag = false;
        for(int i=arr.length-1; i>0; i--){
            int n = i-1;
            while(n >= arr[i-n]){
                if(arr[n] >= i-n){
                    i -= n + 1;
                    break;
                }
                
                if(arr[n] <= i-n){
                    n++;
                }

                if(i - n == 0){
                    System.out.println("FALSE");
                    flag = true;
                    break;
                }
            }
        }

        if(!flag){
            System.out.println("TRUE");
        }
    }
}

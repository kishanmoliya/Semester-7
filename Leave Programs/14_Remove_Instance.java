class Remove_Instance{
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                count++;
            }
        }

        System.out.println(count);
    }
}
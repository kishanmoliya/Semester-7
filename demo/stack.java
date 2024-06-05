import java.util.*;
class stack{
    public static void main(String[] args){
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        st.getMin();
        st.pop();
        st.top();
        st.getMin();
    }

    static class MinStack{
        int arr[];
        int length;
        public MinStack(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Length of Stack: ");
            length = sc.nextInt();

            arr = new int[length];

            for(int i=0; i<length; i++){
                arr[i] = 0;
            }
        }
        
        int top = 0;
        public void push(int val){
            if(top == length){
                System.out.println("Stack overflow");
            }else{
                arr[top++] = val;
            }
        }

        public void pop(){
            if(top == arr.length || top == 0){
                System.out.println("Stack underflow");
            }else{
                int temp = top;
                arr[temp-1] = 0;
                top = top-1;
            }
        }

        public void top(){
            System.out.println("Top Element: "+ arr[top]);
        }

        public void getMin(){
            int min = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }

            System.out.println("Minimum Element: "+ min);
        }
    }
}
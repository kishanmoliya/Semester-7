import java.util.Stack;

public class Reverse_String_Word {
    public static void main(String[] args) {
        String str = "this is an amazing program";

        Stack<String> st = new Stack<String>();
        String word = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                st.push(word);
                word = "";
            }else{
                word += str.charAt(i);
            }
        }
        st.push(word);

        String revertString = "";
        while(st.size() != 1){
            revertString += st.peek() + " ";
            st.pop();
        }
        revertString += st.peek();
        System.out.println(revertString);
    }
}

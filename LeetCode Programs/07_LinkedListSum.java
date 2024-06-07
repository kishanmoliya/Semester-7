public class LinkedListSum{
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

      public void add(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
      }

        public int getVal(){
            int val = head.val;
            head = head.next;
            return val;
        }

    public static void main(String[] args){
        LinkedListSum k = new LinkedListSum();
        k.add(1);
        k.add(2);
        k.add(3);

        int num1 = 0;
        for(int i=0; i<3; i++){
            num1 = num1 * 10 + k.getVal();
        }

        LinkedListSum k1 = new LinkedListSum();
        k1.add(4);
        k1.add(5);
        k1.add(6);

        int num2 = 0;
        for(int i=0; i<3; i++){
            num2 = num2 * 10 + k1.getVal();
        }

        int ans = num1 + num2;

        int rev = 0;
        while(ans > 0){
            int temp1 = ans % 10;
            rev = rev * 10 + temp1;
            ans /= 10;
        }
       
        System.out.println(rev);
    }
}
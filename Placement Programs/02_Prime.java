import java.util.*;
public class MaximumBetweenThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();
       
        boolean flag = false;
        for(int i=2; i<= n/2; i++){
            if(n%i == 0){
                System.out.print(n + " Not Prime");
                flag = true;
                break;
            }
        }

        if(!flag){
             System.out.print(n + " is Prime");
        }
    }
}
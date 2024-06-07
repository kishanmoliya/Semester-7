// W.A.P. to print series 1, 3, 6, 10, 15, …
import java.util.*;
public class Series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();
       
       int count = 1;
        for(int i=0; i<n; i++, count+=i){
            System.out.print(count+i + " ");
        }
    }
}
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
import java.util.Scanner;
public class Pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Row = "); 
        int row = sc.nextInt();       
        System.out.print("Enter the value of Col = ");   
        int col = sc.nextInt();
        
        System.out.println("Pascal's Value of Tirangle(r, c) : " + factorial(col)/(factorial(col-row) * factorial(row)));
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
}
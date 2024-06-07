import java.util.Scanner;
public class Haystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Haystack: ");
        String haystack = sc.next();
        System.out.print("Enter the needle: ");
        String needle = sc.next();

        System.out.println(haystack.indexOf(needle));        
    }
}
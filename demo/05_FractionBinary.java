import java.util.Scanner;

public class FractionBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary: ");
        String binary = sc.next();

        int index = binary.indexOf(".");

        String s1 = binary.substring(0, index);
        String s2 = binary.substring(index+1);

        int count = 0, decimal = 0;
        for(int i=s1.length()-1; i>=0; i--, count++){
            if(s1.charAt(i) == '1'){
                decimal += Math.pow(2, count);
            }
        }

        double count2 = 1, decimal2 = 0;
        for(int i=0; i<s2.length()-1; i++, count2++){
            if(s2.charAt(i) == '1'){
                decimal2 += 1/Math.pow(2, count2);
            }
        }

        System.err.println(decimal + decimal2);
    }
}

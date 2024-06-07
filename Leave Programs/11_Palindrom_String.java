// Problem Statement: Write a program to determine if a given string is a palindrome, considering 
// only alphanumeric characters and ignoring cases.
// Input: 
// "A man, a plan, a canal: Panama"
// "race a car"
// Output: 
// true
// false

public class Palindrom_String {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        
        System.out.println(checkPalindrom(str));
    }
    
    public static boolean checkPalindrom(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();        
        int left = 0, right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

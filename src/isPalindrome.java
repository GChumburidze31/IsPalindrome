/*
Q1. Write a Java program that checks if a given string is a palindrome.

first i need a string to compare letters with, i will choose a palindrome - "madam"
 */



public class isPalindrome {
    public static void main(String[] args) {
        String s = "reder";
        boolean isPalindrome = checkPalindrome(s);
        if(isPalindrome){
            System.out.println("String is a palindrome!!!");
        }else
            System.out.println("Not a Palindrome");

    }
    public static boolean checkPalindrome (String s){
        String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
package Palindrome;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String pal, int head, int tail){
        //base condition 1 => if head crosses tail and there is no false returned, implies string is palindrome.
        if(head >= tail){
            return true;
        }
        //base condition 2 => when characters are not equal
        if(pal.charAt(head) != pal.charAt(tail)){
            return false;
        }

        return isPalindrome(pal, ++head, --tail);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = sc.nextLine();
        System.out.println("Is the string: "+ input +" Palindrome ? "+ isPalindrome(input,0,input.length()-1));

    }
}

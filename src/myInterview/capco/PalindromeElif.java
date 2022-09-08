package myInterview.capco;

import java.util.Scanner;

public class PalindromeElif {
    /*
    Write a method wich takes an input and returns if that input is a palidrome or no.
    A palidrome is something that can be spelled the same way forwars and backwards
    INPUt:'not a pal'
    RESULT: false

    INPUT: 'madam'
    RESULT: true

    INPUT: 'Nurses Run'
    RESULT: true
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));

    }

    public static boolean  isPalindrome(String str) {
        str = str.replaceAll(" ","");
        String reversed = "";
        for(int i = str.length()-1;i >= 0; i--){
            reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)){
            return true;
        }else{
            return false;
        }
    }
}
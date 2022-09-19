package B24InterviewTasks;

import java.util.Arrays;

public class AnagramInt {

    // Function that returns true if a and b
    // are anagarams of each other
    public static boolean areAnagrams(int num1, int num2) {

        // Converting numbers to strings
        char[] num1Arr = (String.valueOf(num1)).toCharArray();
        char[] num2Arr = (String.valueOf(num2)).toCharArray();

        // Checking if the sorting values
        // of two strings are equal
        Arrays.sort(num1Arr);
        Arrays.sort(num2Arr);

        if(Arrays.equals(num1Arr,num2Arr)){

            return true;

        }else{

            return false;
        }
    }

    // Driver code
    public static void main(String[] args) {
        int a = 240;
        int b = 204;

        System.out.println((areAnagrams(a, b)) ? "Yes"
                : "No");
    }
}


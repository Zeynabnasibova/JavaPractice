package B24InterviewTasks;

import java.util.Arrays;

public class MaxNumberArray1 {


/*
Write a method that can find the maximum number from an int Array
 */


    public static int maxNum(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(maxNum(arr));

    }
}
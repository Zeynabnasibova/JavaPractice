package B24InterviewTasks;

import java.util.Arrays;

public class ConcatTwoArray2 {
/*
Write a return method that can concat two arrays
 */

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};


        ConcatTwoArray2 obj = new ConcatTwoArray2();
        System.out.println(Arrays.toString(obj.conCat(arr1, arr2)));
    }

    public int[] conCat(int[] arr1, int[] arr2) {

        int[] concatArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            concatArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {

            concatArr[arr1.length + i] = arr2[i];
        }
        return concatArr;
    }
}
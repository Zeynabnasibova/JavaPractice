package B24InterviewTasks;

import java.util.Arrays;

public class MinNumberArray2 {


     /*
Write a method that can find the maximum number from an int Array
 */


        public static int minNum(int [] arr){

            Arrays.sort(arr);

            return arr[0];

        }
        public static void main(String [] args){

            int [] arr = new int [] {1, 2, 3, 4, 5};

            System.out.println(minNum(arr));

        }

    }
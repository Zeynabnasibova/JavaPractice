package B24InterviewTasks;

import java.util.Arrays;

public class RotateAnArratRightDirections {
    public static void main(String[] args) {

        int [] input = new int [] {1,2,3};

        System.out.println(Arrays.toString(input));
    }
   public static int[] rotateRight( ) {

        int [] input = new int [] {1,2,3};

        int length = input.length;

       for (int i = 0; i < input.length; i++) {
           // take out the last element
           int temp = input[length - 1];

           for (int j = length - 1; j > 0; j--) {
               // shift array elements towards right by one place
               input[j] = input[j - 1]; } input[0] = temp;
       }
       return input;
   }
}

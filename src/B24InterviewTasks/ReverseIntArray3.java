package B24InterviewTasks;

import java.util.Arrays;

public class ReverseIntArray3 {
    public static void main(String[] args) {

        int [] number = new int [] {2, 9, 8, 7};

        int [] numArr = new int [number.length];

        for(int i = number.length -1;i >= 0;i--){

            numArr[number.length-1-i] = number[i];

        }
number=numArr;
        System.out.println(Arrays.toString(number));

    }
}

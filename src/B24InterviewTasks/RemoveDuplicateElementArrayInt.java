package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElementArrayInt {
    /**
     * Java Program to remove duplicate element in an int Array
     */


    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 3, 2, 3, 8, 8, 3};

        ArrayList<Integer> nonduplicate = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!nonduplicate.contains(arr[i])) {

                nonduplicate.add(arr[i]);
            }
        }
        arr = new int [nonduplicate.size()];
        for(int i = 0; i< nonduplicate.size();i++){
            arr[i] = nonduplicate.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }


}

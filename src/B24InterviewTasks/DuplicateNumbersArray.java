package B24InterviewTasks;

import java.util.ArrayList;

public class DuplicateNumbersArray {
    /**
     * Program to print the duplicate elements of an array.
     */

    public static ArrayList<Integer> duplicateElement(int [] arr){

        //   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,10,10};

        ArrayList <Integer> unique = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            if(!unique.contains(arr[i])){

                unique.add(arr[i]);
            }
        }

        ArrayList<Integer> duplicate = new ArrayList<>();

        for(int i = 0; i < unique.size(); i++){
            int count = 0;
            for(int j = 0; j < arr.length;j++){
                if(unique.get(i) == arr[j]){
                    count++;
                }
            }
            if(count  > 1){
                duplicate.add(unique.get(i));

            }
        }
        return duplicate;
    }

    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 8,3,10,10};

        System.out.println(duplicateElement(arr));
    }
}

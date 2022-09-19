package B24InterviewTasks;

public class DuplicateNumbersArray1 {
    /**
     * Program to print the duplicate elements of an array.
     */

    public static String duplicateElement(int [] arr){

        //   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,10,10};
        String duplicate = "";

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++ ){

                if(arr[i] == arr[j]){

                    duplicate += arr[j] + "\n";

                }
            }
        }
        return "Duplicate elements in given array: \n" + duplicate;
    }

    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3,10,10};

        System.out.println(duplicateElement(arr));
    }
}

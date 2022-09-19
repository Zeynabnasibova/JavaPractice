package B24InterviewTasks;

public class SecondMaxNumber {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        int max = Integer.MIN_VALUE;

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > secondMax  && arr[i] != max ) {

                secondMax = arr[i];
            }

        }



        System.out.println ( "Max number: " + max );
        System.out.println ( "Second max number " + secondMax );

    }


}
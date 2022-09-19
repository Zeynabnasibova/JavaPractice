package B24InterviewTasks;

public class SecondMinimumNumber {

    public static void main(String[] args) {

        int [] arr = {1,3,4,5};

        int min = Integer.MAX_VALUE;

        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < min){

                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < second && arr[i] != min){

                second = arr[i];
            }
        }
        System.out.println(second);

    }
}

package B24InterviewTasks;

public class ReverseIntArray2 {

    public static void main(String[] args) {

        int [] number = new int [] {2, 9, 8, 7};

        for(int i = number.length -1;i >= 0;i--){


            int reverse = number[i];

            System.out.print(reverse + " ");


        }


    }
}

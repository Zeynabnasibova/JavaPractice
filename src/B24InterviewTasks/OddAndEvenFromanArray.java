package B24InterviewTasks;

public class OddAndEvenFromanArray {
    public static void main(String[] args) {


        int number[] = {1, 2, 5, 6, 3, 2};

        System.out.print("Odd Numbers:");

        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 != 0) {

                System.out.print(number[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Even Numbers:");

        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 == 0) {

                System.out.print(number[i] +", ");
            }
        }
    }
}
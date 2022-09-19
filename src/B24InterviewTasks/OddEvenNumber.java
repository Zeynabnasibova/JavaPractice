package B24InterviewTasks;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num =  input.nextInt();

        System.out.println(OddAndEven(num));
    }


    public static String OddAndEven(int number){

        if(number % 2 == 0){

            return "even";

        }else{

            return "odd";

        }


    }
}

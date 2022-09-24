package B24InterviewTasks;

public class ConvertIntToString {
    public static void main(String[] args) {

        /*
Code snippet, converting String to int and int to String. Program performs error checking when converting from String to int.

         */


        String numberString = "1000";
//conver String to int
        int number1 = Integer.parseInt(numberString);// return wrapper class obj
        int number = Integer.valueOf(numberString).intValue(); //return primitive value
        System.out.println(number + 2);//1002

        System.out.println(number1 + 2);//1002


        int num = 1000;
//conver integer number to String
        String numString = Integer.toString(num);

        System.out.println(numString + 2);//10002
    }
}

package B24InterviewTasks;

public class CountSameWord {


    public static void main(String[] args) {

        String str1 = "NadirNadirNadir";
        String str2 = "Nadir";

        System.out.println(countWord(str1,str2));
    }

        /*
        -Write me a method that will take 2 string parameters and return how many times second string is in the first string.
         */

    public static int countWord(String str1, String str2){

        //String str1 = "NadirNadirNadir"; // 15-4 = 10
        //String str2 = "Nad";

        int count = 0;

        for(int i = 0; i < str1.length()-4; i++){

    if(str1.substring(i,i+5).contains(str2)){// str1.substring(0,5)

                count++;
            }
        }
        return count;

    }


}

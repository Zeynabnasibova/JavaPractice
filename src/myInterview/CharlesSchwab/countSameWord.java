package myInterview.CharlesSchwab;

public class countSameWord {

    /*
    Given sentence
    String str = "I am working in Schwab, and Schwab is best company";
    count Schwab
     */
    public static void main(String[] args) {

        String str = "I am working in Schwab and Schwab is best company";

        String [] strArr = str.split(" ");

        int count = 0;

        for(int i = 0; i < strArr.length; i++){

            if(strArr[i].equals("Schwab")){

                count++;
            }
        }
        System.out.println(count);
    }
}

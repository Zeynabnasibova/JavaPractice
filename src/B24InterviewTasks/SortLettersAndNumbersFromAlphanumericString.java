package B24InterviewTasks;

import java.util.Arrays;

public class SortLettersAndNumbersFromAlphanumericString {

    /*
    Q6: String -- Sort Letters and Numbers from alphanumeric String:
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
      sort the individual string and append them back together
       Ex:
        Input: "DC501GCCCA098911"
        OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                    //  System.out.println(str2);
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                   // System.out.println(str2);
                }
            }
        }

      //  System.out.println(str2);

     //   String[] arr = str2.split(",");
//        str = "";
//        for (String each : arr) {
//            char[] chars = each.toCharArray();
//            Arrays.sort(chars);
//            for (char eachChar : chars) {
//                str += "" + eachChar;
//            }
//        }
//        System.out.println(str);
        String [] strArr = str2.split(",");

        System.out.println(Arrays.toString(strArr));
        str = "";

        for(int i = 0; i < strArr.length; i++){

            String [] eachStrArr = strArr[i].split("");

            Arrays.sort(eachStrArr);

           // System.out.println(Arrays.toString(eachStrArr));

            for(int j = 0; j < eachStrArr.length; j++){

                str += ""+ eachStrArr[j];
            }

        }
        System.out.println(str);
    }
}
/*
[C, D]
[0, 1, 5]
[A, C, C, C, G]
[0, 1, 1, 8, 9, 9]
 */
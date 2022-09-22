package B24InterviewTasks;

import java.util.HashMap;
import java.util.Map;

public class CountLettersMap3 {
    /**
     Count letters(Map). Write a method that will accept a string as an argument. The method will count the number of appearances of each char and return map. The key will be a letter and the value will be a number of appearances in the string. See input and output in the example
     */

    public static Map<Character, Integer> countLetters(String str) {
        // if order is matter, we can use LinkedHashMap instead
        Map<Character, Integer> letters = new HashMap<>();

        for(int i = 0; i < str.length(); i++){


// if map already contains the key, get the value and put back with +1
            if(letters.containsKey(str.charAt(i))){

                letters.put(str.charAt(i), letters.get(str.charAt(i)) + 1);

            }else{
// if do not contain char as key, new letter put with value 1
                letters.put(str.charAt(i),1);
            }
        }
        return letters;
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println(countLetters(str));


    }


}

package B24InterviewTasks;

import java.util.HashMap;
import java.util.Map;

public class CountLettersMap2 {
    public static void main(String[] args) {
        String str = "ZeynabZ";
        System.out.println(countLetters(str));
    }
    public static Map<Character,Integer> countLetters(String str){
     //   String str = "hello";

        Map<Character, Integer> map = new HashMap<>();

        String unique = "";

        for(int i = 0; i < str.length(); i++){

            if(!unique.contains(""+str.charAt(i))){

                unique += str.charAt(i);
            }
        }

        for(int i = 0; i < unique.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(unique.charAt(i)==str.charAt(j)){

                    count++;
                }
            }
            map.put(unique.charAt(i),count);
        }
return map;
    }
}

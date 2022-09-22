package B24InterviewTasks;

import java.util.*;

public class CountLettersMap1 {
    public static void main(String[] args) {

        String str = "ZeynabZ";
Map<Character , Integer> map = new HashMap<>();
        for(int i = 0;i < str.length(); i++){

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }
               map.put(str.charAt(i),count);
        }
        System.out.println(map);

    }
}

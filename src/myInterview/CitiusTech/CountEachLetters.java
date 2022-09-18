package myInterview.CitiusTech;

import java.util.*;

public class CountEachLetters {
    /*

      Given String str = "Zeynab"
      Output should be Z 1
                       e 1
                       y 1
                       n 1
                       a 1
                       b 1

       */
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(countLetter(str));
    }
    public static Map<String,Integer> countLetter(String str){

        //  String str = "Zeynab";

        String [] strArr = str.split("");

        List<String> list = new ArrayList<String>(Arrays.asList(strArr));

        Map<String,Integer>map = new LinkedHashMap<>();

        for(int i =0; i < list.size(); i++){

            Integer count = Collections.frequency(list,list.get(i));

            map.put(list.get(i),count);

        }
        // System.out.println(map);
        return map;

    }

}
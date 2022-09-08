package myInterview.Capgemini;

import java.util.*;

public class CountLetter {
    /*

    Given String str = "Hello"
    Output should be H 1
                     e 1
                     l 2
                     o 1
     Write your own method.Your method should not be void.Should be with return type

     */
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(countLetter(str));
    }
    public static Map<String,Integer> countLetter(String str){

      //  String str = "Hello";

        String [] strArr = str.split("");

        List<String>list = new ArrayList<String>(Arrays.asList(strArr));

        Map<String,Integer>map = new LinkedHashMap<>();

        for(int i =0; i < list.size(); i++){

            Integer count = Collections.frequency(list,list.get(i));

            map.put(list.get(i),count);

        }
       // System.out.println(map);
        return map;

    }

}


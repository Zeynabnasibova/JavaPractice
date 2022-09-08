package myInterview.capco;

import java.util.*;

public class RepeatedWordQomshu {
    public static void main(String[] args) {
        String str = "The quick brown fox jumped under the nearby tree.What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree.";
        repateWords(str);

    }

    public static void repateWords(String str) {
        str = str.replaceAll("//.", " ").toLowerCase();
        //I need String Array to store words
        String[] allWordsArr = str.split(" ");
        List<String> allWordsList = new ArrayList<>(Arrays.asList(allWordsArr));
        //I should get every word and I have to count
        //I need storage for word and count pair == key and Value
        //I need create Map for word and count
        Map<String,Integer>map = new LinkedHashMap<>();
        //I should travel every word so I will use for each loop
        for(String eachWord : allWordsList){
            int count = Collections.frequency(allWordsList,eachWord);
            //I should not get only once repated word
            if(count > 1)
                map.put(eachWord,count);
        }
//        for(int i = 0; i < allWordsList.size(); i++){
//            Integer count = Collections.frequency(allWordsList,allWordsList.get(i));
//            if(count==1){
//                map.remove(allWordsList.get(i));
//            }else{
//                map.put(allWordsList.get(i),count);
//            }
//        }

        System.out.println("map = " +  map);
        //I should get every single pair from map
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
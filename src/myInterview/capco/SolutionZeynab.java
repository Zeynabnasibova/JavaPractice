package myInterview.capco;

import java.util.*;
public class SolutionZeynab {
    /*
    You want to  find repeated words in a string and display the number of times each of those words was repeated. Ignore case and periods ending sentences . Do not print words that only turn up once in a string
    The quick brown fox jumped under the nearby tree.What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree.
    Expected Output:
    the: 8
    fox: 3
    under: 2
    tree: 2
    applause: 2
     */

    private static final String INPUT = "The quick brown fox jumped under the nearby tree.What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree.";

    public static void main (String [] args) throws Exception{

        String newINPUT = new String(INPUT);

        newINPUT= newINPUT.replaceAll("\\.","").toLowerCase();

        String [] newINPUTArr = newINPUT.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(newINPUTArr));

        // List<String> list = new ArrayList<>(Arrays.asList(newINPUT.split(" ")));

        Map<String,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < list.size(); i++){

            Integer count = Collections.frequency(list,list.get(i));

            if(count==1){

                map.remove(list.get(i));

            }else{

                map.put(list.get(i),count);
            }
 }
        System.out.println(map);

        //I should get every single pair from map
        for(String key : map.keySet()){
            //   System.out.println(key + ": " + map.get(key));
        }
    }
}
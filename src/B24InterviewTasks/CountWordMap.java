package B24InterviewTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWordMap {
    public static void main(String[] args) {

        String str = "The quick brown fox jumped under the nearby tree.What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree.";

        str = str.replaceAll("\\.","").toLowerCase();

        String [] strArr = str.split(" ");

        System.out.println(Arrays.toString(strArr));

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < strArr.length; i++){

            int count = 0;

            for(int j = 0; j < strArr.length; j++){


                if(strArr[i].equals(strArr[j])){

                    count++;
                }
            }
            map.put(strArr[i],count);
        }

        System.out.println(map);
    }
}


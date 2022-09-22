package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueElementsArrayListInteger {
    /**
     Find unique elements in ArrayList Java
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 1));
        System.out.println(allUnique(list));
    }

    public static Map<Integer,Integer> allUnique(ArrayList<Integer>list){

        Map<Integer,Integer> unique = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
unique.put(list.get(i),count);
            }
        }
return unique;
    }

}
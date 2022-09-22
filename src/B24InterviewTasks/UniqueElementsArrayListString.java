package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueElementsArrayListString {
    /**
     Find unique elements in ArrayList Java
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("AB", "A", "A", "B", "B", "B", "C", "C", "C", "D", "E", "F"));
        System.out.println(allUnique(list));

    }
    public static Map<String,Integer> allUnique(ArrayList<String>list){

        Map<String,Integer> unique = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
unique.put(list.get(i),count);            }
        }
        return unique;
    }

}
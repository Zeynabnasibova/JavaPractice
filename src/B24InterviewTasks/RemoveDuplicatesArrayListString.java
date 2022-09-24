package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class RemoveDuplicatesArrayListString {

    /**
     * How to remove duplicates from String ArrayList ?
     */



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("A", "A", "B", "B", "A", "B"));

      ArrayList<String> nonduplicate = new ArrayList<>();

        for(int i = 0; i <list.size(); i++){

            if(!nonduplicate.contains(list.get(i))){

                nonduplicate.add(list.get(i));
            }
        }
list=nonduplicate;
        System.out.println(list);
    }

}

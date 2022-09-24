package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class RemoveDuplicatesArrayListInteger {

    /**
     * How to remove duplicates from Integer ArrayList ?
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 8, 3, 8, 2, 1, 8, 8, 3, 1));

ArrayList<Integer> nonduplicate = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){

            if(!nonduplicate.contains(list.get(i))){

                nonduplicate.add(list.get(i));
            }
        }
list= nonduplicate;
        System.out.println(list);
    }


}

package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmedArrayList2 {

    /*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("Sayad","Ahmed","Zeynab","Ahmed","Ahmed"));

        if(list.contains("Ahmed")) {

            list.removeAll(Arrays.asList("Ahmed"));

        }

        System.out.println(list);


//        Iterator <String> it = list.iterator();
//
//        while(it.hasNext()){
//
//            if(it.next().equals("Ahmed")){
//
//                it.remove();
//            }
//        }
//
//        System.out.println(list);
//
    }
}
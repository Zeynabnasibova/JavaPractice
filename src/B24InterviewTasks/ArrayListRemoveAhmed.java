package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed {

    /*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */

    public static void main(String [] args){

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);

    }

}

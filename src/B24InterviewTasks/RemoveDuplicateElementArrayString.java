package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElementArrayString {
    /**
     * Java Program to remove duplicate element in a String Array
     */

    public static void main(String[] args) {
        String [] str = new String [] {"AB","B","B","B"};

        ArrayList<String> nonduplicate = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {

            if (!nonduplicate.contains(str[i])) {

                nonduplicate.add(str[i]);            }
        }
        str = new String [nonduplicate.size()];
        for(int i = 0; i < nonduplicate.size(); i++){

            str[i] = nonduplicate.get(i);
        }
        System.out.println(Arrays.toString(str));
    }


}

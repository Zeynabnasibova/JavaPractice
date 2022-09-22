package B24InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateCharactersArrayList {
    /**
     * How to print only duplicates in String ArrayList?
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("A","B","B","B","C","D"));
        System.out.println(duplicateChar(list));
    }
    public static String duplicateChar( ArrayList<String>list){ //Arrays.asList("A","B","B","C","D");

        ArrayList<String> letter = new ArrayList<String>();// container  // ABCD

        for(int i = 0; i < list.size();i++){

            if(!letter.contains("" + list.get(i))){ //chek


                letter.add(list.get(i));
            }

        }

        String duplicate = "";

        for(int i = 0; i < letter.size(); i++){
            int count = 0;
            for(int j = 0; j < list.size(); j++){
                if(letter.get(i).equals(list.get(i))) {
                    count++;
                }
            }
            if(count > 1){

                duplicate += letter.get(i);
            }

        }

        return duplicate;


    }
}

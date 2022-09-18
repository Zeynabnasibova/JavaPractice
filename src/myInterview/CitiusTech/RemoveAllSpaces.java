package myInterview.CitiusTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllSpaces {

    public static void main(String[] args) {

        /*  Given
         String str = "a b c  d"
        Remove all spaces
         */

        String str = "a b c  d ";

        String [] strArr = str.split("");

        System.out.println(Arrays.toString(strArr));

        ArrayList< String > list = new ArrayList<>(Arrays.asList(strArr));

        for(int i = 0; i < list.size(); i++){

            if(list.contains(" ")){

                list.removeAll(Arrays.asList(" "));

            }

        }
        System.out.println(list);

        String newStr = "";

        for(int i = 0; i< list.size(); i++){

          newStr += list.get(i);

        }

        str = newStr;

        System.out.println(str);

    }
}

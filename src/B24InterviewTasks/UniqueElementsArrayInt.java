package B24InterviewTasks;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementsArrayInt {
    /**
     Find unique elements in array Java
     */
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 1};
        System.out.println(allUnique(arr));

    }
        public static Map<Integer,Integer> allUnique(int[] arr){

Map<Integer,Integer> unique = new HashMap<>();
      //  String unique = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                unique.put(arr[i],count);
           //     unique += arr[i] + " ";
            }
        }
  return unique;
    }

}
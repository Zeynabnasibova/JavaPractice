package myInterview.CharlesSchwab;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {


    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            count++;
            map.put(s.charAt(i), count);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

/*
public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
 */
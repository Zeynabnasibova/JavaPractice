package myInterview.CharlesSchwab;

public class FindFirstNonRepeatingCharacter2 {

    public static void main(String[] args) {

        firstUniqChar("leetcodelj");

    }

    public static void firstUniqChar(String s) {

        for(int i = 0; i < s.length(); i++){

            int count = 0;

            for(int j = 0; j < s.length(); j++){

                if(s.charAt(i) == s.charAt(j)){

                    count++;
                }
            }
            if(count == 1){

                System.out.println(s.charAt(i));

                break;
            }

        }

    }
}

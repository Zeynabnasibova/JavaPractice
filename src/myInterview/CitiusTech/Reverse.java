package myInterview.CitiusTech;

public class Reverse {

    /*
    Given
    String str = "abcd";
    reverse
     */

    public static void main(String[] args) {

        String str = "abcd";

        String reversed = "";

        for(int i = str.length()-1; i>= 0; i--){

            reversed += str.charAt(i);

        }
        System.out.println(reversed);
    }
}

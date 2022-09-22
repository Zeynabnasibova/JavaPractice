package myInterview.amazon;

public class StringProcent {
    /*
    Given
    String str = "All The Best"
    Output should be: All%20The%20Best
     */
    public static void main(String[] args) {
        String str = "All The Best";
        System.out.println(procent(str));
    }
        public static String procent(String str){//All The Best

        String ready = "";

            str = str.replaceAll(" ","%20");

            return str;
    }
}

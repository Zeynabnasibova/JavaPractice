package B24InterviewTasks;

public class ReverseString2 {

  public  static String  Reverse(String str) {

      return new StringBuffer(str).reverse().toString();

  }

    public static void main(String[] args) {
        String word = "Hello World";

        StringBuilder newWord = new StringBuilder(word);

        newWord.reverse();

        word = newWord.toString();

        System.out.println(word);
    }
}
/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */
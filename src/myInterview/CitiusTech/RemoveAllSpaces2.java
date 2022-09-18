package myInterview.CitiusTech;

public class RemoveAllSpaces2 {

    public static void main(String[] args) {

        String str = " This website is awesome." ;
        str = str.trim();
        str = str.replaceAll(" ","");
        System.out.println(str);
    }
}

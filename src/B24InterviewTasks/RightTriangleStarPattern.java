package B24InterviewTasks;

public class RightTriangleStarPattern {
    public static void main(String args[])
    {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int row=6;
//outer loop for rows
        for(int i=0; i<row; i++) {
//inner loop for columns
            for(int j=0; j<=i; j++) {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
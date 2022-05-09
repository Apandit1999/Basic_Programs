import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);


        int month = scan.nextInt();
        int day = scan.nextInt();

        int year =  scan.nextInt();

        String res = Result.findDay(month, day, year);
 


    }
}

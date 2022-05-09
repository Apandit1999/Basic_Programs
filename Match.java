import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter regex pattern:");
            String regexPattern = sc.nextLine();
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher("The quick brown fox jumps right over the little lazy dog.");
            boolean found = false;
            while(matcher.find())
            {
                System.out.println("found the text " + matcher.group()+ " strating at index" + matcher.start()+" and ending at index " + matcher.end());
                found = true;
            }
           if(!found)
            {
                System.out.println("Match not found.");
            }
        }
    }

}

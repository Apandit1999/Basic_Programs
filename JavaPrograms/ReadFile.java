import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File file = new File("/home/abhinendra/Downloads/phase-2.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> str = new ArrayList<>();
        while(scan.hasNextLine())
        {
            str.add(scan.nextLine());
        }
        System.out.println(str);
}
}

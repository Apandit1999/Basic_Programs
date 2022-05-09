import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Person person = new Person(i);
        person.yearPasses();
        person.amIOld();
        
    }
}
class Person {
    private int age;    
  
    public Person(int initialAge) {
          if(initialAge < 0){
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            age = initialAge;
        }
    }

    public void amIOld() {
        String ans;
          if(age < 13){
            ans = "You are young.";
        }else if(age >= 13 && age < 18){
            ans = "You are a teenager.";
        }else{
            ans = "You are old.";
        }
        System.out.println(ans);
    }

    public void yearPasses() {
          age += 1;
    }
}

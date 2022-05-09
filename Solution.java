import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+ B.length());
        int compare = A.compareTo(B);
        if(compare<=0){
         System.out.println("No");
        }
        else
         System.out.println("yes");
          // create a string
    String nameA = A;

    // create two substrings from name
    // first substring contains first letter of name
    // second substring contains remaining letters
    String firstLetter = nameA.substring(0, 1);
    String remainingLetters = nameA.substring(1, nameA.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();

    // join the two substrings
    nameA = firstLetter + remainingLetters;
     

         String nameB = B;

    // create two substrings from name
    // first substring contains first letter of name
    // second substring contains remaining letters
    String firstLetterB = nameB.substring(0, 1);
    String remainingLettersB = nameB.substring(1, nameB.length());

    // change the first letter to uppercase
    firstLetterB = firstLetterB.toUpperCase();

    // join the two substrings
    nameB = firstLetterB + remainingLettersB;
    System.out.format("%1s %1s",nameA,nameB);

         
        
    }
}




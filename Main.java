//Guess the number.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //generating a random number
        System.out.print("Guess the number: ");
        double randomNumber=Math.random();
        randomNumber = randomNumber * 100;
        //randomNumber = randomNumber +1;
        int randomInt =(int) randomNumber;
        int x = scan.nextInt();
        int count=1;
        while (x != randomInt) {

            if (x < randomInt) {
                System.out.println(x + " is small");
            } else {
                System.out.println(x + " is big");
            }
           x = scan.nextInt();
            count++;
        }
        System.out.println("Bingo!, You guessed it.\nThe number is " + randomInt);
        System.out.println("You guess the number in " + count + " tries.");

    }
}
//Guess the number.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int num = RandomInteger();
        int x = scan.nextInt();
        int count=1;
        while (x != num) {

            if (x < num) {
                System.out.println(x + " is small");
            } else {
                System.out.println(x + " is big");
            }
           x = scan.nextInt();
            count++;
        }
        System.out.println("Bingo!, You guessed it.\nThe number is " + num);
        System.out.println("You guess the number in " + count + " tries.");

    }
    public static int  RandomInteger() {
        double randomNumber=Math.random();
        randomNumber = randomNumber * 100;
        int randomInt =(int) randomNumber;
        return randomInt;
    }
}
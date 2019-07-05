import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random n = new Random();
        int random = n.nextInt(100);
        random += 1;

        System.out.println("A random # from 1-100 has been chosen, take your first guess");

        Scanner input = new Scanner(System.in);
        int guess, triesremaining, closer;
        triesremaining = 10;
        closer = 100;
        boolean win = false;
        guess = input.nextInt();
        while (win == false && triesremaining > 0) {

            --triesremaining;
            if (guess == random) {

                System.out.print("Good job, you guessed correctly with ");
                System.out.print(triesremaining);
                System.out.print(" tries remaining");
                win = true;
            } else {
                if(closer > Math.abs(random - guess)){
                    System.out.println("Your guess was closer, try again");
                }
                else {
                    System.out.println("Your guess strayed farther, try again");
                }
                closer = Math.abs(random - guess);
                System.out.print("You have ");
                System.out.print(triesremaining);
                System.out.println(" tries remaining");
                guess = input.nextInt();

            }

        }
        if (win == false){
            System.out.println("You lose, try again");
            System.out.print("The actual number was: ");
            System.out.print(random);
        }
    }
}

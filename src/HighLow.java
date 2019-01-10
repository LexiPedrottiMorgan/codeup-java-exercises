import java.util.Scanner;
import java.lang.Math;

public class HighLow {

    public static void main(String[] args) {
        System.out.print("Let's play the number guessing game!");
        System.out.print(randomNumberGame());

    }

        public static int randomNumberGame() {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            int randomNumber = (int) (Math.random() * range) + min;
            System.out.print("\nGuess the number:\n");
            int numberGuess = scan.nextInt();
            int turnCounter = 1;
            for (int i = 1; i <= 100; i++) {
                if (randomNumber == numberGuess) {
                    System.out.println("\nWINNER WINNER!\nThe number was: ");
                  return randomNumber;
                } else if(numberGuess < randomNumber){
                    System.out.println("HIGHER! Wrong Guesses: " + turnCounter);
                    turnCounter++;
                    numberGuess = scan.nextInt();
                } else if(numberGuess > randomNumber){
                    System.out.println("LOWER! Wrong Guesses: " + turnCounter);
                    turnCounter++;
                    numberGuess = scan.nextInt();
                }
            }
            System.out.println("\nGame over");
            return numberGuess;
        }

    }


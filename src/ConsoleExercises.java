import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.print("Console Exercises");

        double pi = 3.14159;
        System.out.format("%nThe value of pi is approximately %.2f.", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.format("%nEnter an integer%n");
        int userInteger = Integer.parseInt(scanner.nextLine());

        System.out.format("%nEnter 3 words%n");
        String userInputFirst = scanner.next();
        String userInputSecond = scanner.next();
        String userInputThird = scanner.next();
        System.out.format("You entered the number: %d. You entered the words: %s, %s, %s", userInteger, userInputFirst, userInputSecond, userInputThird);


    }
}


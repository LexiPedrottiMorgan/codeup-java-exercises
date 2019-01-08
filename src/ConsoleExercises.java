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

        System.out.format("%nEnter a Sentence%n");
        String userSentence = scanner.nextLine();
        userSentence = scanner.nextLine();
        //A better way to fix the skipping problem: Quick two steps to avoid            the scanner object “skipping” inputs
        //1. `new Scanner(System.in).useDelimiter("\n")`
        //2. use `.next()` instead of .nextLine for your text inputs


        System.out.format("%nWe are going to calculate the perimeter, area, and volume of the classroom.%n");
        System.out.format("%nEnter the length in feet%n");
        float length = scanner.nextFloat();

        System.out.format("%nEnter The width in feet%n");
        float width = scanner.nextFloat();

        System.out.format("%nEnter The height in feet%n");
        float height = scanner.nextFloat();

        float perimeter = (length*2) + (width*2);
        float area = length * width;
        float volume = length * width * height;
        System.out.format("You entered the number: %d.%nYou entered the words: %s, %s,  %s. %nYour sentence was: %s %n", userInteger, userInputFirst, userInputSecond, userInputThird, userSentence);

        System.out.format("%nThe perimeter of the room is %.2f feet.%nThe area of the room is %.2f square feet.%nThe volume of the room is %.2f cubed feet.%n", perimeter, area, volume);


    }
}


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
//this prompt gets executed but the sentence is blank in the output

        System.out.format("%nWe are going to calculate the perimeter, area, and volume of the classroom.%n");
        System.out.format("%nEnter the length in feet%n");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.format("%nEnter The width in feet%n");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.format("%nEnter The height in feet%n");
        int height = Integer.parseInt(scanner.nextLine());

        int perimeter = (length*2) + (width*2);
        int area = length * width;
        int volume = length * width * height;
        System.out.format("You entered the number: %d.%nYou entered the words: %s, %s,  %s. %nYour sentence was: %s %n", userInteger, userInputFirst, userInputSecond, userInputThird, userSentence);

        System.out.format("%nThe perimeter of the room is %d feet.%nThe area of the room is %d square feet.%nThe volume of the room is %d cubed feet.%n", perimeter, area, volume);


    }
}


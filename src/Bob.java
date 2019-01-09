import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        System.out.print("Enter something to talk to Bob.\n");
        for (int i=0; i<=5; i++) {
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            String userInput = scan.nextLine();
            if(i<5) {
                if (userInput.endsWith("?")) {
                    System.out.print("Sure\n");
                } else if (userInput.endsWith("!")) {
                    System.out.print("Whoa, chill out!\n");
                } else if (userInput.equals("")) {
                    System.out.print("Fine. Be that way!\n");
                } else {
                    System.out.print("Whatever.\n");
                }
            } else if (i>=5) {
                System.out.print("Goodbye.\n");
            }
        }
    }

}

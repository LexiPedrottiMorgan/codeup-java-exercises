package util;
import java.util.Scanner;


public class Input {

       private Scanner scan = new Scanner(System.in).useDelimiter("\n");

       String getString(){
           System.out.println("Enter a string:");
           String input = scan.next();
            return input;
       }

       boolean yesNo(){
           System.out.println("Enter yes or no");
           String input = scan.next();
           if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.contains("yes")) {
               return true;
           } return false;
       }

       int getInt(int min, int max){
           System.out.println("Enter a number between " + min + " and " + max);
           int inputNumber = scan.nextInt();
           if (inputNumber >= min && inputNumber <= max){
               return inputNumber;
           } else {
               System.out.println("Enter a number between " + min + " and " + max);
               scan.nextInt();
               return (getInt(min, max));
           }
       }

       int getInt(){
           System.out.println("Enter a number:");
          int input = scan.nextInt();
           return input;
       }

       double getDouble(double min, double max) {
           System.out.println("Enter a double between " + min + " and " + max);
           double inputDouble = scan.nextDouble();
           if (inputDouble >= min && inputDouble <= max) {
               return inputDouble;
           } else {
               System.out.println("Invalid Input.");
               scan.nextDouble();
               return (getDouble(min, max));
           }
       }

       double getDouble() {
           System.out.println("Enter a double:");
              double input = scan.nextDouble();
               return input;
           }



    public static void main(String[] args) {

    }
}


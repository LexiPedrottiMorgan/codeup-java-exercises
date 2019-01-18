package util;
import java.util.Scanner;


public class Input {

       private Scanner scan = new Scanner(System.in).useDelimiter("\n");

       public String getString(){
           String input = scan.next();
            return input;
       }

       public boolean yesNo(){
           String input = scan.next();
           if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.contains("yes")) {
               return true;
           } return false;
       }


    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = scan.next();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y") || input.contains("yes")) {
            return true;
        } return false;
    }

       public int getInt(int min, int max){
           System.out.println("Enter a number between " + min + " and " + max + ":");
           int inputNumber = scan.nextInt();
           if (inputNumber >= min && inputNumber <= max){
               return inputNumber;
           } else {
               System.out.println("Enter a number between " + min + " and " + max);
               scan.nextInt();
               return (getInt(min, max));
           }
       }

       public int getInt(){
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

       public double getDouble() {
           System.out.println("Enter a double:");
              double input = scan.nextDouble();
               return input;
           }



    public static void main(String[] args) {

    }
}


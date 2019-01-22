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



       public int getInt(){
          System.out.println("Enter a number:");
           String input = scan.next();
           try {
                return Integer.valueOf(input);
          } catch(NumberFormatException ex) {
              System.out.println("There was a number format exception here!!");
              return getInt();
           }
       }



    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        String inputNumber = scan.next();
        try {
            int inputValue = Integer.valueOf(inputNumber);
            if (inputValue >= min && inputValue <= max) {
                return inputValue;
            } else {
                System.out.println("Invalid input");
                return (getInt(min, max));
            }
        } catch(NumberFormatException ex) {
            System.out.println("There was a number format exception here!!");
            return getInt(min, max);
        }

    }


    double getDouble(double min, double max) {
           System.out.println("Enter a double between " + min + " and " + max);
           String inputDouble = scan.next();
           try {
               double inputDoubleValue = Double.valueOf(inputDouble);
               if (inputDoubleValue >= min && inputDoubleValue <= max) {
                   return inputDoubleValue;
               } else {
                   System.out.println("Invalid Input.");
                   return (getDouble(min, max));
               }
           } catch(NumberFormatException ex){
               System.out.println("There was a number format exception here!!");
               return getDouble(min, max);
           }
       }


       public double getDouble() {
           System.out.println("Enter a double:");
              String input = scan.next();
           try {
               return Double.valueOf(input);
           } catch(NumberFormatException ex){
               System.out.println("There was a number format exception here!!");
            } return getDouble();
          }



    public static void main(String[] args) {

    }
}


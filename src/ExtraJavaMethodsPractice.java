import java.util.Scanner;

public class ExtraJavaMethodsPractice {
    public static void main(String[] args) {
//        System.out.println(firstChar("New string here!"));
//        System.out.println(secondChar("New string here!"));
//        System.out.println(lastChar("New string here!"));
//        System.out.println(secondToLastChar("New string here!"));
//        System.out.println(userWantsToContinue());
//        System.out.println(userWantsToContinue());
//        System.out.println(isEven(6));
//        System.out.println(isEven(13));
//        System.out.println(isOdd(45));
//        System.out.println(isOdd(22));
//        System.out.println(countsOdds(1, 5));
//        System.out.println(countsEvens(3, 10));
//        System.out.println(isVowel("A"));
//        System.out.println(isVowel("B"));
//        System.out.println(hasVowel("Dog"));
//        System.out.println(hasVowel("www"));
//        System.out.println(countVowels("aaabbbcccdddeee"));
//        fizzBuzz(100);
//        forLoopFizzBuzz(100);
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(7));
//        System.out.println(isPrime(12));
        getTwentyPrimes(20);
//

//  ***** This closes the Main Method *****
    }

//  TODO: //////////////////////////////////////////////////////////////////////////////////////////
//  Java Methods Practice:

//  1. Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
    public static char firstChar(String userInput){
            return userInput.charAt(0);
        }

//  2. Write a method named secondChar() that takes a string as an input and returns the second letter as a character data type.

    public static char secondChar(String userInput){
        return userInput.charAt(1);
    }

//  3. Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.

    public static char lastChar(String userInput){
        int length = userInput.length();
        return userInput.charAt(length-1);
    }

//  4. Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.

    public static char secondToLastChar(String userInput){
        int length = userInput.length();
        return userInput.charAt(length-2);
    }

//  5. Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
    public static boolean userWantsToContinue(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Do you want to continue? [y/n]");
        String userInput = scan.next();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

//  6. Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.

    public static boolean isEven(int input) {
        if (input % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

//  7.Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.

    public static boolean isOdd(int input) {
        if (input % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

//  8. Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.

    public static int countsOdds(int start, int end){
            int oddCounter = 0;
        for (int i = start; i<=end; i++){
            if (isOdd(i)){
                oddCounter++;
            }
        } return oddCounter;
    }


//  9. Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.

    public static int countsEvens(int start, int end){
            int evenCounter = 0;
         for(int i = start; i<= end; i++) {
             if (isEven(i)){
                 evenCounter++;
             }
         } return evenCounter;
    }


//  10. Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".

    public static boolean isVowel(String input) {
        if (input.length() > 1){
            return false;
        }
         return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");
        }


//  11. Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
//
     public static boolean hasVowel(String input){
                String letter = "";

                for (int i=0; i< input.length(); i++){
                    letter = input.charAt(i) + "";
                    if(isVowel(letter)) {
                        return true;
                    }
                }
               return false;
     }

//  12. Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.

     public static int countVowels(String input){
        int vowelCounter = 0;
        String letter = "";
        for (int i = 0; i<= input.length()-1; i++){
            letter = input.charAt(i) + "";
            if (isVowel(letter)) {
                vowelCounter++;
            }
        } return vowelCounter;

     }

//  13. Write a solution to FizzBuzz using recursion instead of a loop.

    public static void fizzBuzz(int number) {
        if (number > 0) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 != 0 && number % 5 != 0) {
                System.out.println(number);
            }
            number -= 1;

            fizzBuzz(number);

        }
    }



//FizzBuzz for loop:

    public static void forLoopFizzBuzz(int number) {
        for(int i = 1; i<=number; i++){
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println((i + ""));
            }
        }

    }




//  14. Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.

//    works for positive numbers, breaks for negative numbers:
    public static boolean isPrime(int number) {
        boolean prime = false;
        int divisibleCounter = 0;
        for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisibleCounter++;
                }
        }
        if (divisibleCounter <= 2) {
                    prime = true;
                    return prime;
                } else if (divisibleCounter>2){
                    prime = false;
                    return prime;
                }
             return prime;
        }




//  15. Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.


//No tailing comma:
    public static void getTwentyPrimes(int input){
        int primeCounter = 0;
        int number = 1;
        while (primeCounter < input) {
            if (isPrime(number)) {
                if (primeCounter != input-1) {
                    System.out.print(number + ", ");
                    primeCounter++;
                } else if (primeCounter == input -1) {
                 System.out.print(number);
                 primeCounter++;
             }
            }
            number ++;
        }
    }


//has a tailing comma:
//    public static void getTwentyPrimes(int input){
//        int primeCounter = 0;
//        int number = 1;
//        while (primeCounter < input) {
//                if (isPrime(number)) {
//                    System.out.print(number + ", ");
//                    primeCounter++;
//                }
//                    number ++;
//              }
//        }






// ***** This closes the ExtraJavaMethodsPractice Method at the very top *****
}

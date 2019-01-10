public class ExtraJavaMethodsPractice {
    public static void main(String[] args) {
        System.out.println(firstChar("New string here!"));
        System.out.println(secondChar("New string here!"));
        System.out.println(lastChar("New string here!"));
        System.out.println(secondToLastChar("New string here!"));
        System.out.println(isVowel("A"));
        System.out.println(isVowel("B"));
        System.out.println(hasVowel("Dog"));
        System.out.println(hasVowel("www"));


//  ***** This closes the Main Method *****
    }

//  TODO: //////////////////////////////////////////////////////////////////////////
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

//    public static boolean userWantsToContinue(String userInput){
//        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
//            boolean continueYes = true;
//        } else {
//            System.out.println("You chose not to continue.");
//        } return continueYes;
//    }

//  6. Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
//
//  7.Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
//
//  8. Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
//
//  9. Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
//
//  10. Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".

    public static boolean isVowel(String input) {
        if (input.length() > 1){
            return false;
        }
         return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("y");
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


//  13. Write a solution to FizzBuzz using recursion instead of a loop.

//  14. Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.

//  15. Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.








// ***** This closes the ExtraJavaMethodsPractice Method at the very top *****
}

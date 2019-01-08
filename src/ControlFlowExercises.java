import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//  1. Loping Basics-----------------------------------------------------------
        System.out.println("Incrementing from 5 to 15 using a while loop:");
        int i = 5;
        while(i<=15){
            System.out.println(i);
            i++;
        }

//      adding spacing between exercises
        System.out.println();

        System.out.println("Counting by 2's from 0 to 100 using a do while loop:");
        int number = 0;
        do {
           System.out.println(number);
           number += 2;
        } while (number <= 100);
//      adding spacing between exercises
        System.out.println();


        //      adding spacing between exercises
        System.out.println();

        System.out.println("Counting backwards from 100 to -10 by 5's using do while loop:");
        int countBackwards = 100;
        do {
            System.out.println(countBackwards);
            countBackwards -=5;
        } while (countBackwards >= -10);


        //      adding spacing between exercises
        System.out.println();

        System.out.println("Starting at 2 and squaring the number up to 1,000,000 using a do while loop:");
        long squaring = 2;
        do{
            System.out.println(squaring);
            squaring *= squaring;
        } while(squaring <= 1000000);


        //      adding spacing between exercises
        System.out.println();

        System.out.println("Refactoring the previous loops to use a for loop");

        System.out.println("Incrementing from 5 to 15 using a for loop:");
        for(int n = 5; n<=15; n++) {
            System.out.println(n);
        }

        //      adding spacing between exercises
        System.out.println();
        System.out.println("Counting by 2's from 0 to 100 using a for loop:");
        for(int x = 0; x <=100; x+=2){
            System.out.println(x);
        }


        //      adding spacing between exercises
        System.out.println();

        System.out.println("Counting backwards from 100 to -10 by 5's using a for loop:");
        for (int b = 100; b>=-10; b-=5) {
            System.out.println(b);
        }

        //      adding spacing between exercises
        System.out.println();

        System.out.println("Starting at 2 and squaring the number up to 1,000,000 using a for loop:");
        for(long squaringFor = 2; squaringFor<=1000000; squaringFor*=squaringFor){
            System.out.println(squaringFor);
        }

//      adding spacing between exercises
        System.out.println();

//  2. FIZZBUZZ------------------------------------------------------------------

        System.out.format("FizzBuzz Exercise.%nPrint numbers 1-100.%nIf the number is divisible by 3 print Fizz.%nIf the number is divisible by 5 print Buzz.%nIf the number is divisible by 3 and 5 print FizzBuzz.%nIf the number doesn't fall into any of these categories print the number:%n");
        for (int num=1; num<=100; num++){
            if (num%3==0 && num%5== 0){
                System.out.println("FizzBuzz");
            } else if (num%3==0){
                System.out.println("Fizz");
            } else if (num%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

//      adding spacing between exercises
        System.out.println();

//  3. Table of Powers----------------------------------------------------------
   String userChoice;
    do {
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.format("What number would you like to go up to?%n");

       int userNumber = scan.nextInt();
       System.out.format("Here is your table up to %d: %n", userNumber);
//        printing the table
       System.out.format("%nnumber  | squared |  cubed%n------- | ------- | -------%n");

       for (int a = 1; a <= userNumber; a++) {
           int aSquared = a * a;
           int aCubed = a * a * a;
           System.out.format(" %-7d| %-8d| %-7d%n", a, aSquared, aCubed);
       }
       System.out.println("Do you want to do another number? (yes or no)");
       userChoice = scan.next();

   } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));








//      adding spacing between exercises
        System.out.println();
//  4.Convert Number Grades to Letter Grades-----------------------------------
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("Enter a number grade, and I will convert it to a letter grade:%n");
        int userGrade = scan.nextInt();

        String letterGrade="";

        if (userGrade>88 && userGrade <=100){
            letterGrade = "A";
        } else if (userGrade < 88 && userGrade > 80) {
            letterGrade = "B";
        } else if (userGrade < 80 && userGrade > 67){
            letterGrade = "C";
        } else if (userGrade < 67 && userGrade > 60) {
            letterGrade = "D";
        } else if (userGrade < 60){
            letterGrade = "F";
        } else {
            letterGrade = "That is not a valid grade entry.";
        }

            System.out.format("Number Grade: %s. Letter Grade: %s%n", userGrade, letterGrade);


    }
}

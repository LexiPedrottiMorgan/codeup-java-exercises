import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.print(addition(5, 7));
        System.out.println();
        System.out.print(subtraction(10, 3));
        System.out.println();
        System.out.print(multiplication(9, 2));
        System.out.println();
        System.out.print(division(12, 3));
        System.out.println();
        System.out.print(modulus(37, 2));
        System.out.print(getInteger(1, 10));
        System.out.print(factorial());

    }

    // 1. Basic Arithmetic Methods:
    public static int addition(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int subtraction(int numberA, int numberB) {
        return numberA - numberB;
    }

    public static int multiplication(int numberA, int numberB) {
        return numberA * numberB;
    }

    public static int division(int numberA, int numberB) {
        return numberA / numberB;
    }

    public static int modulus(int numberA, int numberB) {
        return numberA % numberB;
    }


// 2. Method that validates user inputs are in a certain range:

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("\nEnter a number between  %d - %d: %n", min, max);
        int userInteger = scan.nextInt();
        if (userInteger >= min && userInteger <= max) {
            return userInteger;
        } else {
            System.out.format("\nThat number was not between %d - %d:", min, max);
            return getInteger(min, max);
        }

    }

// 3. Calculate the factorial of a number:

    public static long factorial() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("\nEnter a number between 1 - 10 to get its factorial: %n");
        long factorialNumber = scan.nextInt();
        long factorial = 1;
        System.out.print(factorialNumber + "! = ");
        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
            if (i < factorialNumber) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " ");
            }
        }
            System.out.print("= ");
            return factorial;
    }
// 4. Create an application that simulates dice rolling:











//this closes the MethodsExercises class at the very top:
}




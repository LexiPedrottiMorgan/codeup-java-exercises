import java.util.Scanner;
import java.lang.Math;

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
        System.out.print(multiplyManually(4, 5));
        System.out.print(getInteger(1, 10));
        System.out.print(factorial());
        promptRoll();
    }

// 1. Basic Arithmetic Methods:
/////  Addition: //////////////////////////////////////////////////
    // integers:
    public static int addition(int numberA, int numberB) {
        return numberA + numberB;
    }
    // doubles:
    public static double addition(double numberA, double numberB) {
        return numberA + numberB;
    }

///////  Subtraction: /////////////////////////////////////////////
    //integers:
    public static int subtraction(int numberA, int numberB) {
        return numberA - numberB;
    }
    // doubles:
    public static double subtraction(double numberA, double numberB) {
        return numberA - numberB;
    }


/////////  Multiplication: //////////////////////////////////////////
    //integers:
    public static int multiplication(int numberA, int numberB) {
        return numberA * numberB;
    }
    //doubles:
    public static double multiplication(double numberA, double numberB) {
        return numberA * numberB;
    }

///////// Division: /////////////////////////////////////////////////
    //integers:
    public static int division(int numberA, int numberB) {
        return numberA / numberB;
    }

    //doubles:
    public static double division(double numberA, double numberB) {
        return numberA / numberB;
    }


///////// Modulus: //////////////////////////////////////////////////
    public static int modulus(int numberA, int numberB) {
        return numberA % numberB;
    }


//////////BONUS: Multiply without the * operator: /////////////

    public static long multiplyManually(long a, long b) {
        if (a==0||b==0){
            return 0;
        }
        long product = 0;

        if (b>1){
            do {
                product += a;
                b--;
            } while (b >= 1);
        } else {
            do {
                product -=a;
                b++;
            } while(b <= -1);
        }
        return product;
    }




// 2. Method that validates user inputs are in a certain range:////////////////////////////////////////

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

// 3. Calculate the factorial of a number://///////////////////////////////////////////////////////////

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



// 4. Create an application that simulates dice rolling://///////////////////////////////////////////////

    public static void promptRoll() {
        System.out.println("\nLet's roll the dice.");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.format("\nHow many side are on the dice?\n");
        int dice = scan.nextInt();
        System.out.println("Ready to roll? [y/n]");
        String readyRoll = scan.next();
        if (readyRoll.equalsIgnoreCase("y")) {
            diceRoll(dice);
        }
    }

        public static void diceRoll(int dice) {
        //  define the range for the roll for dice
        int max = dice;
        int min = 1;
        int range = max - min + 1;

            int diceRollA = (int) (Math.random() * range) + min;
            System.out.println("Die A: " + diceRollA);
//
            int diceRollB = (int) (Math.random() * range) + min;
            System.out.println("Die B: " + diceRollB);
//
            int rollTotal = diceRollA + diceRollB;
            System.out.println("Dice Total: " + rollTotal);

    }




//this closes the MethodsExercises class at the very top:
}




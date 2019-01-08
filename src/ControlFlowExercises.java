public class ControlFlowExercises {
    public static void main(String[] args) {
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


    }
}

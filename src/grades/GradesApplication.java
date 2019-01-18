package grades;
import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

    HashMap<String, Student> students = new HashMap<>();
    //  import input class:
      Input input = new Input();


        Student student1 = new Student("Lexi");
        Student student2 = new Student("Aaron");
        Student student3 = new Student("Molly");
        Student student4 = new Student("Mako");

        student1.addGrade(97);
        student1.addGrade(100);
        student1.addGrade(95);

        student2.addGrade(75);
        student2.addGrade(100);
        student2.addGrade(87);

        student3.addGrade(45);
        student3.addGrade(80);
        student3.addGrade(67);

        student4.addGrade(85);
        student4.addGrade(30);
        student4.addGrade(60);

        students.put("LexiPedrottiMorgan", student1);
        students.put("Aaronb2", student2);
        students.put("GoodestGirlMollyPop", student3);
        students.put("MoonMoonMako", student4);

        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:\n");
        for (String key: students.keySet()){
            System.out.print(" | " + key + " | ");
        }

        System.out.println("\n\n ** OR enter \"ALL\" to view all students grades and class average");

        do {
        System.out.println("\n\nWhich user do you want information on? \nEnter username below:");
            System.out.print("> ");
         String userInput = input.getString();

         if (students.keySet().contains(userInput)) {
             System.out.println("\nInformation for: " + userInput + "\n");
             System.out.println("Name: " + students.get(userInput).getName() + "\nGithub username: " + userInput);
             System.out.println("Current Average: " + students.get(userInput).getAverage());
             System.out.println("All Grades: " + students.get(userInput).getGrades());
         }
//         this is for bonus #2 to display all students grades: NOT WORKING YET
//         else if(userInput.equalsIgnoreCase("ALL")) {
//             System.out.println("Name: " + students.get(students).getName());
//             System.out.println("Grades: " + students.get(students).getGrades());
//             System.out.println("Average: " + students.get(students).getAverage());
//            }
            else {
             System.out.println("Sorry, no student found with the github username of " + userInput);
             System.out.println("\nEnter a valid username to view information:\n");
             userInput = input.getString();
             System.out.print("> " + userInput);
         }
     } while (input.yesNo("\nWould you like to view another user?"));


        System.out.println("\nGoodbye");




//        closes MAIN:
    }



//   closes GRADESAPPLICATION:
}

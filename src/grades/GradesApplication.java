package grades;
import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

    HashMap<String, Student> students = new HashMap<>();

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

        System.out.println("\n\nWhich user do you want information on? \nEnter username below:");

//        import input class:
        Input input = new Input();

        String userInput = input.getString();

        System.out.println("> " + userInput);

        if (students.keySet().contains(userInput)) {
            System.out.println("Information for: " + userInput + "\n");
            System.out.println("Name: " + students.get(userInput).getName() + " - Github username: " + userInput);
            System.out.println("Current Average: " + students.get(userInput).getAverage());

        } else {
            System.out.println("Sorry, no student found with the github username of " + userInput);
            System.out.println("\nEnter a valid username to view information:\n");
            userInput = input.getString();
            System.out.println("> " + userInput);
        }







//        closes MAIN:
    }



//   closes GRADESAPPLICATION:
}

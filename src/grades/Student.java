package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer>grades = new ArrayList<>();




// Constructor:
    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }


    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };




//     grades getter:
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public int getAverage() {
        if (grades.size() == 0) {
            return 0;
        } else {
            grades = getGrades();
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }



//MAIN method:
    public static void main(String[] args) {

        Student student1 = new Student("Lexi");

          student1.addGrade(100);
          student1.addGrade(90);
          student1.addGrade(95);
          student1.addGrade(97);

        System.out.println("Name: " + student1.getName() + "\n"
            + "Average: " + student1.getAverage()  + "\n"
            + "All Grades: " + student1.grades + "\n"
            +  "------------------------------------"  );


        Student student2 = new Student("Aaron");
        student2.addGrade(50);
        student2.addGrade(80);
        student2.addGrade(65);
        student2.addGrade(70);

         System.out.println("Name: " + student2.getName() + "\n"
             + "Average: " + student2.getAverage()  + "\n"
             + "All Grades: " + student2.grades + "\n"
             +  "------------------------------------"  );


    }

// Closes Student Class:
}

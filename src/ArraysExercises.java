import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    Person[] people = new Person[5];

        people[0] = new Person("Lexi");
        people[1] = new Person("Aaron");
        people[2] = new Person("Molly");
        people[3] = new Person("Mako");
        people[4] = new Person("Annie");


        for(Person person: people){
           System.out.println(person.getName());
       }


        for (Person person: addPerson(people, new Person("Newest!!"))){
        System.out.println(person.getName());

        }



//closes Main
    }


    public static Person[] addPerson(Person[] people, Person singlePerson){
        Person[] newListOfPeople = Arrays.copyOf(people, people.length+1);
         newListOfPeople[people.length] = singlePerson;
         return newListOfPeople;
    }


//closes ArraysExercise
}

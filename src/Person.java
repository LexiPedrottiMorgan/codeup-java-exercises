public class Person {
    public static void main(String[] args) {


        Person person1 = new Person("John");
        System.out.println(person1.getName());
        person1.sayHello();

        Person person2 = new Person("Jane");
        System.out.println(person2.getName());
        person2.sayHello();
        System.out.println(getNumberOfPeople());
    }

    private static int numberOfPeople = 0;


//  Constructor:
    public Person(String name){
        this.name = name;
        numberOfPeople++;

    }

    public static int getNumberOfPeople(){
        return numberOfPeople;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("The name was set to: " + name);
    }

    public void sayHello() {
        System.out.println("Hello, " + getName());
    }



// This closes the person method:
}

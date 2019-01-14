public class Person {
    public static void main(String[] args) {

    Person person1 = new Person();

    person1.setName("Lexi");
    person1.getName();
    person1.sayHello();


    Person person2 = new Person();
    person2.setName("Aaron");
    person2.getName();
    person2.sayHello();

    }

    private String name;

    public String getName() {
        System.out.println("The person's name is: " + name);
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

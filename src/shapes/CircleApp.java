package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {


            Input input = new Input();
            double radius = input.getDouble();
            System.out.println("The double entered:" + radius);
            Circle circle = new Circle(radius);
            System.out.format("The area of a circle with a radius of %.2f is %.2f. %n", radius, circle.getArea());
            System.out.format("The circumference of a circle with a radius of %.2f is %.2f. %n", radius, circle.getCircumference());
            System.out.println("Do you want to continue making circles?");
            System.out.println(input.yesNo());

        }

//closes the main class:
    }






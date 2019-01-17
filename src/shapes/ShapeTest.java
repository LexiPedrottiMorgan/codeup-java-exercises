package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(2,3);

//        Measurable square = new Square(5);
//        Measurable rectangle = new Rectangle(2,3);
//
//        System.out.println(square.getArea());
//        System.out.println(rectangle.getPerimeter());
//        System.out.println(rectangle.getArea());
//        System.out.println(square.getPerimeter());

        System.out.println("Shape 1:");
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        System.out.println("Shape 2:");
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());




//EXERCISE QUESTIONS:

// 9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

//It doesn't compile because it either needs to be declared abstract or needs to implement the methods that are in the Measurable Interface. You have to implement all of the methods in the interface otherwise the code won't compile.


// 10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

// I get the error "can't resolve method" because it is out of scope and there is no getter for it in the constructor




//OLD- from previous exercise before refactoring:
//    Rectangle box1 = new Rectangle(5, 4);
//    box1.getInfo();
////        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
////        System.out.println("The area of box1 is: " + box1.getArea());
//
//
//    Rectangle box2 = new Square(5);
//        box2.getInfo();

//  closes main:
    }

// closes ShapeTest:
}


.
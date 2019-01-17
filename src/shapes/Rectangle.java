package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public int getPerimeter() {
       return 2*length + 2*width;
    }


    public int getArea() {
        return length*width;
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }



// Closes Rectangle
}







//OLD- from previous exercise before refactoring:
//Code from Inheritance and Polymorphism Exercise:
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getArea(){
//        int area = length*width;
//        return area;
//    }
//
//
//    public int getPerimeter(){
//        int perimeter = (2*length) + (2*width);
//        return perimeter;
//    }
//
//   public void getInfo() {
//       if (length == width) {
//           System.out.println("The perimeter of a square with side length of " + length + " is: " + getPerimeter());
//           System.out.println("The area of a square with side length of " + length + " is: " + getArea());
//       } else {
//           System.out.println("The perimeter of a rectangle with length of " + length + " and width of " + width + " is: " + getPerimeter());
//           System.out.println("The area of a rectangle with length of " + length + " and width of " + width + " is: " + getArea());
//       }
//   }



package shapes;


public class Square extends Quadrilateral {

    @Override
    public int getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public int getArea() {
        return length*width;
    }

    public Square(int side) {
        super(side, side);
    }

// closes square class:
}






//OLD- from previous exercise before refactoring:
//Code from Inheritance and Polymorphism Exercise:
//public class Square extends Rectangle {
//    private int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//
//    @Override
//    public int getArea(){
////     explicit casting to make Math.pow an int instead of double
//        return (int) Math.pow(side, 2);
//    }
//
//    @Override
//    public int getPerimeter(){
//        return 4*side;
//    }




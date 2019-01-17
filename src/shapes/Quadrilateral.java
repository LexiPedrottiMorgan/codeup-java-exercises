package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
   protected int length;
   protected int width;


//   CONSTRUCTOR:
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }


//abstract methods for setting length and width:
    abstract class setLength{

    }

    abstract class setWidth{

}






//    closes Quadrilateral class:
}

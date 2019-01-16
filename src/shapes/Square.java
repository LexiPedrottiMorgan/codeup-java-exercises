package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public int getArea(){
//     explicit casting to make Math.pow an int instead of double
        return (int) Math.pow(side, 2);
    }

    @Override
    public int getPerimeter(){
        return 4*side;
    }


// closes square class:
}

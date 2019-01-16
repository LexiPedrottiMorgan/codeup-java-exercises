package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        int area = length*width;
        return area;
    }


    public int getPerimeter(){
        int perimeter = (2*length) + (2*width);
        return perimeter;
    }

}

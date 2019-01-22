package util;

public class InputTest {

    public static void main(String[] args) {
    Input input = new Input();
        System.out.println("Enter a string:\n");
        System.out.println(input.getString());
        System.out.println("Continue?");
        System.out.println(input.yesNo());
        System.out.println(input.getInt());
        System.out.println(input.getInt(1, 5));
        System.out.println(input.getDouble());
        System.out.println(input.getDouble(1.5, 5.5));

    }

}

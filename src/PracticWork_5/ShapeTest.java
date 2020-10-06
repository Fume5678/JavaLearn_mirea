package PracticWork_5;

import java.io.IOException;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0f, 2.0f, 3.0f);

        Rect rect = new Rect();
        rect.setColor(new Vector3(1.0f));

        Square square = new Square(4.0f);
        square.setPosition(new Vector3(2.0f, 3.0f, 0.0f));

        //System.out.println(circle + "\n" + rect + "\n" + square);
        System.out.println(rect);
        System.out.println(circle);
        System.out.println(square);
    }
}

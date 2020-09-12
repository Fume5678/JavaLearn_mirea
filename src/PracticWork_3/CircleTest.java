package PracticWork_3;
import PracticWork_3.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle);

        circle.setColor(1.0f, 0.0f, 0.0f);
        circle.setRad(10);
        circle.setPos(new Circle.Pos(5.0f, 3.0f, 0.0f));
        circle.setName("MegaKrug");

        System.out.println(circle);

        Circle circle2 = new Circle("Biba", new Circle.Pos(5.0f, 3.0f, -1.0f));
        circle2.setColor(0.0f, 1.0f, 0.0f);
        System.out.println(circle.depthTest(circle2));
    }
}

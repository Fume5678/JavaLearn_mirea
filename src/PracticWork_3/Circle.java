package PracticWork_3;
import java.lang.Object;

public class Circle {
    private String name;
    private float rad;

    // Pos
    public static class Pos {
        float x;
        float y;
        float z;

        public Pos() {
            x = 0;
            y = 0;
            z = 0;
        }

        public Pos(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return x + " " + y + " " + z;
        }
    };
    private Pos pos;


    // Color
    public static class Color {
        float red;
        float green;
        float blue;

        public Color() {
            red = 0;
            green = 0;
            blue = 0;
        }

        public Color(float red, float green, float blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        @Override
        public String toString() {
            return red + " " + green + " " + blue;
        }
    };
    private Color color = new Color();

    // Constructors
    public Circle() {
        this.name = "Circle";
        pos = new Pos();
        color = new Color();
        rad = 1.0f;
    }

    public Circle(String name) {
        this.name = name;
        pos = new Pos();
        color = new Color();
        rad = 1.0f;
    }

    public Circle(String name, Pos pos) {
        this.name = name;
        this.pos = pos;
        color = new Color();
        rad = 1.0f;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", rad=" + rad +
                ", pos=" + pos +
                ", color=" + color +
                '}';
    }


    // Count Middle Color
    public Color depthTest(Circle other){
        if (this.pos.z > other.getPos().z){
            return this.color;
        }
        else
            {
            return other.getColor();
        }
    }


    // Getters and Setters
    public Color getColor(){
        return color;
    }

    public void setColor(float red, float green, float blue){
        color.red = red;
        color.green = green;
        color.blue = blue;
    }

    public void setColor(Color newColor){
        color.red = newColor.red;
        color.green = newColor.green;
        color.blue = newColor.blue;
    }

    public float getRad() {
        return rad;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(float x, float y, float z) {
        pos.x = x;
        pos.y = y;
        pos.z = z;
    }

    public void setPos(Pos newPos) {
        pos.x = newPos.x;
        pos.y = newPos.y;
        pos.z = newPos.z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

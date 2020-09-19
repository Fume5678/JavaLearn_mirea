package PracticWork_5;

public class Rect extends Shape {
    private Float width;
    private Float height;

    Rect() {
        this.width = 0.0f;
        this.height = 0.0f;
    }

    Rect(Float width, Float height) {
        this.width = width;
        this.height = height;
    }

    public Rect(float posx, float posy, float width, float height) {
        super(posx, posy, 0);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return height * width;
    }

    @Override
    public float getPerimeter() {
        return 2 * height + 2 * width;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Type: Rectangle" + "\n" +
                "Width: " + width + "\n" +
                "Height: " + height +  "\n";
    }
}

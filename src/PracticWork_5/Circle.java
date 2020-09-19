package PracticWork_5;

public class Circle extends Shape{
    private Float radius;

    public Circle(Float radius) {
        this.radius = radius;
    }

    public Circle(float posx, float posy, Float radius) {
        super(posx, posy, 0);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float)(2 * Math.PI * radius);
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Type: Circle" + "\n" +
                "Radius: " + radius + "\n";
    }
}

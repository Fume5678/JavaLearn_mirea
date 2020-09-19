package PracticWork_5;

abstract class Shape {
    private Vector3f position;
    private Vector3f color;

    Shape() {
        position = new Vector3f(0.0f);
        color = new Vector3f(0.0f);
    }

    Shape(float posx, float posy, float posz) {
        position = new Vector3f(posx, posy, posz);
        color = new Vector3f(0.0f);
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public Vector3f getPosition() {
        return position;
    }

    public void setPosition(Vector3f position) {
        this.position = position;
    }

    public Vector3f getColor() {
        return color;
    }

    public void setColor(Vector3f color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape id: " + super.toString() + "\n" +
                "Position: " + this.position + "\n" +
                "Color: " + this.color;
    }
}

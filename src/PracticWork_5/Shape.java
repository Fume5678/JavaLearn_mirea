package PracticWork_5;


abstract class Shape {
    private Vector3 position;
    private Vector3 color;

    Shape() {
        position = new Vector3(0.0f);
        color = new Vector3(0.0f);
    }

    Shape(float posx, float posy, float posz) {
        position = new Vector3(posx, posy, posz);
        color = new Vector3(0.0f);
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public Vector3 getColor() {
        return color;
    }

    public void setColor(Vector3 color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape id: " + super.toString() + "\n" +
                "Position: " + this.position + "\n" +
                "Color: " + this.color;
    }
}

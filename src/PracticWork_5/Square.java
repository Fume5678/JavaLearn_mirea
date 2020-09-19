package PracticWork_5;

public class Square extends Shape {
    private Float size;

    public Square(Float size) {
        this.size = size;
    }

    public Square(Float posx, Float posy, Float size) {
        super(posx, posy, 0);
        this.size = size;
    }

    @Override
    public float getArea() {
        return size*size;
    }

    @Override
    public float getPerimeter() {
        return size * 4;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Type: Square" + "\n" +
                "Size: " + size + "\n";
    }
}

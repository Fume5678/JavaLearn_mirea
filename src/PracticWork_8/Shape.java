package PracticWork_8;

import PracticWork_5.Vector3;

import java.awt.*;

public abstract class Shape {
    Vector3<Float> position;
    Vector3<Float> color;

    public Shape(Vector3<Float> position) {
        this.position = position;
        color = new Vector3<Float>(0.0f);
    }

    public abstract void paint(Graphics g);

    public Vector3<Float> getPosition() {
        return position;
    }

    public void setPosition(Vector3<Float> position) {
        this.position = position;
    }

    public Vector3<Float> getColor() {
        return color;
    }

    public void setColor(Vector3<Float> color) {
        this.color = color;
    }
}

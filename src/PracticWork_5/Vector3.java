package PracticWork_5;


import java.util.EmptyStackException;

public class Vector3<T> {
    T x;
    T y;
    T z;

    public Vector3(){
        x = null;
        y = null;
        z = null;
    }

    public Vector3(T digit) {
        this.x = digit;
        this.y = digit;
        this.z = digit;
    }

    public Vector3(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    T get(int i){
        if (i < 0 || i > 2) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        switch (i) {
            case 0:
                return x;
            case 1:
                return y;
            case 2:
                return z;
        }
        throw new Error("Cant return value");
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }
}

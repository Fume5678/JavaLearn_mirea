package PracticWork_5;

public class Vector3f {
    Float x;
    Float y;
    Float z;

    public Vector3f(Float digit) {
        this.x = digit;
        this.y = digit;
        this.z = digit;
    }

    public Vector3f(Float x, Float y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Float get(int i){

        if (i < 0 || i > 2){
            throw new IndexOutOfBoundsException("dfghjkjhgf") ;
        }
        switch (i){
            case 0:
                return x;
            case 1:
                return y;
            case 2:
                return z;
        }
        return 0.0f;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}

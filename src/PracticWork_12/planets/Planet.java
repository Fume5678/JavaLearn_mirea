package PracticWork_12.planets;

import javax.swing.*;
import java.awt.*;

public enum Planet{
    MERCURY ("Меркурий", 3.303e+23, 2.4397e6),
    VENUS   ("Венера", 4.869e+24, 6.0518e6),
    EARTH   ("Земля", 5.976e+24, 6.37814e6),
    MARS    ("Марс", 6.421e+23, 3.3972e6),
    JUPITER ("Юпитер", 1.9e+27,   7.1492e7),
    SATURN  ("Сатурн", 5.688e+26, 6.0268e7),
    URANUS  ("Уран", 8.686e+25, 2.5559e7),
    NEPTUNE ("Няптун", 1.024e+26, 2.4746e7);

    private final String name;
    private final double mass;   // в килограммах
    private final double radius; // в метрах

    private Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() { return name; }
    public double mass() { return mass; }
    public double radius() { return radius; }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Mass: " + mass + " Kg\n" +
                "Radius: " + radius + " m\n";
    }
}

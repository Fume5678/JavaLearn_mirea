package PracticWork_8;

import PracticWork_5.Vector3;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Circle extends Shape{
    private final ArrayList<Vector3<Float>> vertices;
    private final int amountVertices;
    private final float radius;

    public Circle(Vector3<Float> position, int vertices, float radius){
        super(position);
        this.vertices = new ArrayList<Vector3<Float>>();
        amountVertices = Math.max(vertices, 3);
        this.radius = Math.max(radius, 0.1f);
        genPoints();
    }

    private void genPoints(){
        float angle = 0;
        float tmp = (float) Math.sin(120);

        for (int i = 0; i < amountVertices; i++){
            float x = (float) (radius * Math.cos(Math.toRadians(angle))) + position.getX();
            float y = (float) (radius * Math.sin(Math.toRadians(angle))) + position.getY();
            vertices.add(new Vector3<Float>(x, y, 0.0f));

            angle += 360.0f / amountVertices;
        }
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        GeneralPath polygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD, 100);

        polygon.moveTo(vertices.get(0).getX(), vertices.get(0).getY() + radius);
        for (Vector3<Float> vertex : vertices) {
            polygon.lineTo(vertex.getX(), vertex.getY() + radius);
        }

        polygon.closePath();
        g2.setPaint(new Color(color.getX(), color.getY(), color.getZ()));
        g2.fill(polygon);
    }
}

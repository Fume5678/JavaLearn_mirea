package PracticWork_8;

import PracticWork_5.Vector3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ShapesApp {

    static class PaintComponent extends Component{
        private final ArrayList<Shape> shapes = new ArrayList<Shape>();
        private BufferedImage image = null;


        PaintComponent(){
            try {
                image = ImageIO.read(new File("F:\\work\\projects\\Java\\JavaLearning\\resource\\Wave.jpg"));
            }catch (IOException e){
                System.out.println(e);
            }
        }

        public void paint(Graphics g){
            for (int i = 3; i < 13; i++) {
                Circle circle = new Circle(new Vector3<Float>(i*60.0f, 20.0f, 0.0f), i, 30);
                circle.setColor(new Vector3<Float>((float) Math.random(), (float) Math.random(), (float) Math.random()));
                shapes.add(circle);
            }
            for (int i = 13; i < 23; i++) {
                Circle circle = new Circle(new Vector3<Float>((i-10)*60.0f, 80.0f, 0.0f), i, 30);
                circle.setColor(new Vector3<Float>((float) Math.random(), (float) Math.random(), (float) Math.random()));
                shapes.add(circle);
            }

            for (Shape shape: shapes){
                shape.paint(g);
            }

            g.drawImage(image, 200, 200, 200, 200, null);
        }
    }

    ShapesApp(){
        JFrame frame = new JFrame();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("F:\\work\\projects\\Java\\JavaLearning\\resource\\Wave.jpg"));
        }catch (IOException e){
            System.out.println(e);
        }

        frame.add(new PaintComponent());
        int frameWidth = 800;
        int frameHeight = 600;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ShapesApp();
    }

    public void paint(Graphics2D g){
        Circle circle = new Circle(new Vector3<Float>(100f), 3, 100);
        circle.paint(g);
    }

}
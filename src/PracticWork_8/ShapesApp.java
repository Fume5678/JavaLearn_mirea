package PracticWork_8;

import PracticWork_5.Vector3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ShapesApp {

    // Класс как сцена для отображение нескольких фигур и картинки
    static class Scene1 extends Component{
        private final ArrayList<Shape> shapes = new ArrayList<Shape>();
        private BufferedImage image = null;
        JFrame frame;

        Scene1(){
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

    // Инициализация окна и добавления сцен для отрисовки
    ShapesApp(){
        JFrame frame = new JFrame();

        frame.add(new Scene1()); // Задания 1-2 в сцене 1
        frame.add(new Scene2()); // Задание 3 в сцене 2
                                 // Можно было заморочиться с переключением сцен. Но проще уже так
        int frameWidth = 800;
        int frameHeight = 600;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ShapesApp();
    }
}
package PracticWork_9;

import PracticWork_5.Vector3;
import PracticWork_8.Circle;
import PracticWork_8.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Scene3 extends JPanel {
    JLabel label;
    JTextArea input;
    JButton btn;
    private ArrayList<Shape> shapes;

    Scene3(){
        shapes = new ArrayList<Shape>();
        label = new JLabel("Input amount of vertex");
        label.setBounds(100, 100, 200, 30);

        input = new JTextArea();
        input.setBounds(100, 140, 200, 30);
        input.setText("3");

        btn = new JButton("Create");
        btn.setBounds(100, 180, 200, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCircle();
                repaint();
            }
        });

        this.setLayout(null);

        this.add(label);
        this.add(input);
        this.add(btn);
    }

    void addCircle(){
        float x = Math.round(Math.random()*1000)%WindowInfo.WIDTH;
        float y = Math.round(Math.random()*1000)%WindowInfo.HEIGHT;

        int val;
        try{
            val = Integer.parseInt(input.getText());
        } catch (Exception e){
            System.out.println(e);
            val = 5;
        }

        Circle circle =  new Circle(new Vector3<Float>(x, y, 0.0f), val, 20);
        circle.setColor(new Vector3<Float>(x/ WindowInfo.WIDTH, y / WindowInfo.HEIGHT, 0.0f));
        shapes.add(circle);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape i : shapes){
            i.paint(g);
        }
    }

}

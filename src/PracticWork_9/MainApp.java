package PracticWork_9;

import javax.swing.*;

public class MainApp {
    MainApp(){
        JFrame frame = new JFrame();
        frame.add(new Scene3());

        int frameBuffWidth = WindowInfo.WIDTH;
        int frameBuffHeight = WindowInfo.HEIGHT;

        frame.setSize(frameBuffWidth, frameBuffHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainApp();
    }
}

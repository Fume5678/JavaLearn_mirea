package PracticWork_11;

import PracticWork_9.WindowInfo;

import javax.swing.*;

public class Main {
    Main(){
        JFrame frame = new JFrame();
        frame.add(new Scene4());

        int frameBuffWidth = WindowInfo.WIDTH;
        int frameBuffHeight = WindowInfo.HEIGHT;

        frame.setSize(frameBuffWidth, frameBuffHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

package PracticWork_12;

import PracticWork_11.Main;
import PracticWork_11.Scene4;
import PracticWork_12.planets.Planet;
import PracticWork_9.WindowInfo;

import javax.swing.*;

public class SunsetApp {
    SunsetApp(){
        JFrame frame = new JFrame();
        frame.add(new MainScene());

        int frameBuffWidth = WindowInfo.WIDTH;
        int frameBuffHeight = WindowInfo.HEIGHT;

        frame.setSize(frameBuffWidth, frameBuffHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SunsetApp();
    }
}

package PracticWork_8;

import PracticWork_5.Vector3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scene2 extends JPanel implements ActionListener{
        private ImageIcon[] frames;
        Timer animTimer;
        int currentFrame, totalFrame = 8, delay = 33;

    public Scene2() {
        try {
            frames = new ImageIcon[totalFrame];
            for (int i = 0; i < totalFrame; ++i){
                frames[i] = new ImageIcon("E:\\Project\\Java\\JavaLearn_mirea\\resource\\FlowerAnim\\boy-" + (i + 1) + ".png");
            }

        } catch (Exception e){
            System.out.println(e);
        }

        startAnimation();
    }

    public void startAnimation(){
        if (animTimer == null) {
            currentFrame = 0;
            totalFrame = frames.length;
            animTimer = new Timer(delay, this);
            animTimer.start();
        } else if (!animTimer.isRunning()){
            animTimer.restart();
        }

    }

    public void stopAnimation(){
        animTimer.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (frames[currentFrame].getImageLoadStatus() == MediaTracker.COMPLETE) {
            g.drawImage(frames[currentFrame].getImage(), 100, 100, 100, 100, null);
            currentFrame = (currentFrame + 1) % totalFrame;
        }
    }
}

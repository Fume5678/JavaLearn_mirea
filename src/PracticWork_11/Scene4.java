package PracticWork_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Scene4 extends JPanel {
    private final JTextArea input;
    private final JTextArea scoreArea;
    private final JTextArea tittle;
    int randVal;
    int score;
    int tries;
    int oldVal;
    private JButton btn;
    private JLabel label;


    Scene4(){
        score = 0;
        tries = 3;
        oldVal = -1;
        randVal = (int) (Math.round(Math.random()*100)%20);

        tittle = new JTextArea("Угадай random value )");
        tittle.setFont(new Font("arial", Font.PLAIN, 24));
        tittle.setBackground(Color.lightGray);
        tittle.setBounds(100, 10, 300, 30);
        tittle.setEditable(false);


        label = new JLabel("Input Number");
        label.setBounds(100, 100, 200, 30);

        input = new JTextArea();
        input.setBounds(100, 150, 200, 30);
        input.setText("3");

        scoreArea = new JTextArea("Score: " + score + "\ntries: " + tries + "\nLast val: " + oldVal);
        scoreArea.setBounds(500, 100, 150, 50);
        scoreArea.setEditable(false);

        btn = new JButton("Enter");
        btn.setBounds(100, 200, 200, 50);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check();
                repaint();
            }
        });

        this.setLayout(null);

        this.add(tittle);
        this.add(label);
        this.add(input);
        this.add(scoreArea);
        this.add(btn);
    }

    void check(){
        int val;
        try {
            val = Integer.parseInt(input.getText());
        } catch (Exception e){
            System.out.println("Ошибка ввода: " + e);
            label.setText("Error input. Try again.");
            val = -1;
        }

        tries--;
        if (tries <= 0){
            tries = 3;
            score--;
            tittle.setForeground(new Color(Math.min(Math.abs(Math.min(score, 0)), 10) / 10.0f, 0.0f, 0.0f));
            oldVal = randVal;
            randVal = (int) (Math.round(Math.random()*100)%20);
            label.setText("You lose :( New val was asked");
        }
        else if (val < randVal){
            label.setText("Input value is smaller");
        } else if (val > randVal){
            label.setText("Input value is greater");
        } else {
            label.setText("You right!!! New val was asked");
            oldVal = randVal;
            randVal = (int) (Math.round(Math.random()*100)%20);
            tries = 0;
            score++;
        }
        scoreArea.setText("Score: " + score + "\ntries: " + tries + "\nLast val: " + oldVal);
    }
}

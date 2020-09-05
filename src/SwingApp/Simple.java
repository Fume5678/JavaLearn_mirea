package SwingApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple extends Frame implements ActionListener {
    JTextField tf; JLabel l; JButton b;
    public Simple(StringBuilder result){
        JTextArea ta = new JTextArea();
        b = new JButton("Pop");
        ta.setText(result.toString());

        ta.setFocusable(false);
        ta.setBounds(30, 30, 500, 500);
        b.setBounds(500, 30, 60, 30);
        b.addActionListener(this);
        add(b);
        add(ta);
        setSize(800,600);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        System.exit(0);
    }
}  
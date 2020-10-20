package PracticWork_12;

import PracticWork_12.planets.Planet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainScene extends JPanel implements ActionListener{
    private ArrayList<JLabel> buttons;
    private JComboBox dropmenu;
    private JComboBox dropmenu2;
    private JTextArea planetInfor1;
    private JTextArea planetInfor2;

    MainScene(){
        String[] planets = new String[Planet.values().length];
        int count = 0;
        for (Planet i : Planet.values()){
            planets[count] = i.getName();
            count++;
        }

        dropmenu = new JComboBox(planets);
        dropmenu.setSelectedIndex(0);
        dropmenu.setEditable(true);
        dropmenu.setBounds(30, 30, 240, 30);

        dropmenu2 = new JComboBox(planets);
        dropmenu2.setSelectedIndex(0);
        dropmenu2.setEditable(false);
        dropmenu2.setBounds(
                dropmenu.getX() + dropmenu.getWidth() + 30, dropmenu.getY(),
                dropmenu.getWidth(), dropmenu.getHeight());

        this.setLayout(null);

        this.add(dropmenu);
        this.add(dropmenu2);

        planetInfor1 = new JTextArea(Planet.values()[dropmenu.getSelectedIndex()].toString() + "Surface gravity: " +
                getGravityStr(dropmenu) + "\n");
        planetInfor1.setEditable(false);
        planetInfor1.setBounds(
                dropmenu.getX(), dropmenu.getY() + dropmenu.getHeight() + 10,
                dropmenu.getWidth() + 5, 90);
        planetInfor2 = new JTextArea(Planet.values()[dropmenu2.getSelectedIndex()].toString() + "Surface gravity: " +
                getGravityStr(dropmenu) + "\n");
        planetInfor2.setEditable(false);
        planetInfor2.setBounds(
                dropmenu2.getX(), dropmenu2.getY() + dropmenu2.getHeight() + 10,
                dropmenu2.getWidth() + 5, 90);

        setActionListener();

        this.add(planetInfor1);
        this.add(planetInfor2);
    }

    String getGravityStr(JComboBox dropmenu){
        double gravityForce =
                Planet.values()[dropmenu.getSelectedIndex()].mass() /
                Planet.values()[dropmenu.getSelectedIndex()].radius() /
                        Planet.values()[dropmenu.getSelectedIndex()].radius();

        return Double.toString(gravityForce);
    }

    void setActionListener(){
        dropmenu.addActionListener(this);
        dropmenu2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        planetInfor1.setText(Planet.values()[dropmenu.getSelectedIndex()].toString() + "Surface gravity: " +
                getGravityStr(dropmenu) + "\n");
        planetInfor2.setText(Planet.values()[dropmenu2.getSelectedIndex()].toString() + "Surface gravity: " +
                getGravityStr(dropmenu2) + " Kg/m^2\n");
    }
}

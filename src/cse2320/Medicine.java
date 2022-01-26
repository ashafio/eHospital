package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medicine extends JFrame {
    public Container medicineContainer;
    public Font font,buttonFont;

    Medicine()
    {
        medicinecomponents();
    }
    public void medicinecomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(433, 20, 500, 700);
        this.setTitle("Medicine");

        font = new Font("architectural", Font.BOLD, 20);
        buttonFont = new Font("segoe ui", Font.PLAIN, 14);

        medicineContainer = this.getContentPane();
        medicineContainer.setLayout(null);
        medicineContainer.setBackground(Color.decode("#3ad2ff"));


    }};

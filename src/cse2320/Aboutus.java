package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aboutus extends JFrame {
    public Container aboutContainer;
    public Font font,buttonFont;

    Aboutus()
    {
        aboutcomponents();
    }
    public void aboutcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(433, 20, 500, 700);
        this.setTitle("Medicine");

        font = new Font("architectural", Font.BOLD, 20);
        buttonFont = new Font("segoe ui", Font.PLAIN, 14);

        aboutContainer = this.getContentPane();
        aboutContainer.setLayout(null);
        aboutContainer.setBackground(Color.GRAY);


    }};

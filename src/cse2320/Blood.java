package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Blood extends JFrame {

    public Container bloodContainer;
    public Font font,buttonFont;
    public JLabel welcome,lblDonate,lblGet;
    public JButton donate,get;



    Blood() {
        bloodcomponents();
    }

    public void bloodcomponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(433,20,500,500);
        this.setTitle("BloodBank");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.BOLD,16);

        bloodContainer = this.getContentPane();
        bloodContainer.setLayout(null);
        bloodContainer.setBackground(Color.cyan);

        welcome = new JLabel("Welcome to BloodBank");
        welcome.setBounds(20,20,400,50);
        welcome.setFont(font);
        bloodContainer.add(welcome);

        lblDonate = new JLabel("If you want to donate blood, Click ");
        lblDonate.setBounds(20,80,350,60);
        lblDonate.setFont(font);
        bloodContainer.add(lblDonate);

        donate = new JButton("Donate");
        donate.setBounds(375,85,90,40);
        donate.setFont(buttonFont);
        donate.setBackground(Color.PINK);
        bloodContainer.add(donate);

        donate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BloodDonate blooddonate = new BloodDonate();
                blooddonate.setVisible(true);
            }
        });

        lblGet = new JLabel("If you need blood, Click ");
        lblGet.setBounds(20,150,250,60);
        lblGet.setFont(font);
        bloodContainer.add(lblGet);

        get = new JButton("Get");
        get.setBounds(280,155,90,40);
        get.setFont(buttonFont);
        get.setBackground(Color.PINK);
        bloodContainer.add(get);

        get.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BloodGet bloodget = new BloodGet();
                bloodget.setVisible(true);
            }
        });


    };
}

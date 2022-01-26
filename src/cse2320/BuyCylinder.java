//package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//public class BuyCylinder extends JFrame {
//
//    public Container buycylinderContainer;
//    public Font font,buttonFont;
//    public JLabel lblCylinderInfo;
//    public JRadioButton Ten,Twenty;
//    public ButtonGroup buttongroup;
//    public JButton go;
//    public JLabel provideInfo,quantity,name,address,phone;
//    public JTextField tfQuantity,tfName,tfAddress,tfPhone;
//
//
//
//
//    BuyCylinder()
//    {
//        buycylindercomponents();
//    }
//    public void buycylindercomponents()
//    {
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setBounds(300,20,766,700);
//        this.setTitle("Buy Cylinder");
//
//        font = new Font("architectural",Font.BOLD,20);
//        buttonFont = new Font("segoe ui",Font.PLAIN,14);
//
//        buycylinderContainer = this.getContentPane();
//        buycylinderContainer.setLayout(null);
//        buycylinderContainer.setBackground(Color.cyan);
//
//        lblCylinderInfo = new JLabel("Select The Quantity in litre.");
//        lblCylinderInfo.setFont(font);
//        lblCylinderInfo.setBounds(20,20,300,50);
//        lblCylinderInfo.setBackground(Color.darkGray);
//        lblCylinderInfo.setForeground(Color.red);
//        buycylinderContainer.add(lblCylinderInfo);
//
//        buttongroup = new ButtonGroup();
//
//        Ten = new JRadioButton("Ten Litre");
//        Ten.setFont(font);
//        Ten.setBounds(325,20,150,50);
//        Ten.setBackground(Color.darkGray);
//        Ten.setForeground(Color.red);
//        buycylinderContainer.add(Ten);
//
//        Twenty = new JRadioButton("Twenty Litre");
//        Twenty.setFont(font);
//        Twenty.setBounds(480,20,150,50);
//        Twenty.setBackground(Color.darkGray);
//        Twenty.setForeground(Color.red);
//        buycylinderContainer.add(Twenty);
//
//
//        buttongroup.add(Ten);
//        buttongroup.add(Twenty);

//
//        Ten.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==Ten)
//                {
//                    String tenstr = "Ten Litres";
//                }
//            }
//        });
//
//        Twenty.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==Twenty)
//                {
//                    String twentystr = "Twenty Litres";
//                }
//            }
//        });
//
//        go = new JButton("Go");
//        go.setBounds(550,80,60,40);
//        go.setFont(buttonFont);
//        go.setBackground(Color.green);
//        go.setForeground(Color.BLACK);
//        buycylinderContainer.add(go);
//
//        go.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                dispose();
//                Cylinder cylinder = new Cylinder();
//                cylinder.setVisible(true);
//            }
//        });

//    };
//}

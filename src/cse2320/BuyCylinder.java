package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyCylinder extends JFrame {

    public Container cylinderContainer;
    public Font font,buttonFont;
    public JLabel lblCylinderInfo;
    public JRadioButton Ten,Twenty;
    public ButtonGroup buttongroup;
    public JButton go;
    public JLabel provideInfo,quantity,name,address,phone;
    public JTextField tfQuantity,tfName,tfAddress,tfPhone;




    BuyCylinder()
    {
        hospitalcomponents();
    }
    public void hospitalcomponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,20,766,700);
        this.setTitle("Buy Cylinder");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.PLAIN,14);

        cylinderContainer = this.getContentPane();
        cylinderContainer.setLayout(null);
        cylinderContainer.setBackground(Color.cyan);

        lblCylinderInfo = new JLabel("Select The Quantity in litre.");
        lblCylinderInfo.setFont(font);
        lblCylinderInfo.setBounds(20,20,300,50);
        lblCylinderInfo.setBackground(Color.darkGray);
        lblCylinderInfo.setForeground(Color.red);
        cylinderContainer.add(lblCylinderInfo);

        buttongroup = new ButtonGroup();

        Ten = new JRadioButton("Ten Litre");
        Ten.setFont(font);
        Ten.setBounds(325,20,150,50);
        Ten.setBackground(Color.darkGray);
        Ten.setForeground(Color.red);
        cylinderContainer.add(Ten);

        Twenty = new JRadioButton("Twenty Litre");
        Twenty.setFont(font);
        Twenty.setBounds(480,20,150,50);
        Twenty.setBackground(Color.darkGray);
        Twenty.setForeground(Color.red);
        cylinderContainer.add(Twenty);


        buttongroup.add(Ten);
        buttongroup.add(Twenty);

        go = new JButton("Go");
        go.setBounds(550,80,60,40);
        go.setFont(buttonFont);
        go.setBackground(Color.green);
        go.setForeground(Color.BLACK);
        cylinderContainer.add(go);

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                public JLabel provideInfo,quantity,name,address,phone;
//                public JTextField tfQuantity,tfName,tfAddress,tfPhone;
                provideInfo = new JLabel("We provide Cash on delivery.All you need to do is fill up this form.");
                provideInfo.setBounds(10,100,746,50);
                provideInfo.setBackground(Color.green);
                cylinderContainer.add(provideInfo);

                quantity = new JLabel("Quantity: ");
                quantity.setBounds(20,160,60,40);
                cylinderContainer.add(quantity);

                name = new JLabel("Name: ");
                name.setBounds(20,210,60,40);
                cylinderContainer.add(name);

                address = new JLabel("Address: ");
                address.setBounds(20,260,60,40);
                cylinderContainer.add(address);

                phone = new JLabel("Phone: ");
                phone.setBounds(20,310,60,40);
                cylinderContainer.add(phone);



            }
        });

    };
}

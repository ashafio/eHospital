package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cylinder extends JFrame {

    public Container cylinderContainer;
    public Font font, buttonFont;

    public JLabel lblCylinderInfo;
    public JRadioButton Ten,Twenty;
    public ButtonGroup buttongroup;

    public JButton submit;
    public JLabel provideInfo, quantity, name, address, phone,available;
    public JTextField tfQuantity, tfName, tfAddress, tfPhone;


    Cylinder() {
        cylindercomponents();
    }

    public void cylindercomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 20, 766, 700);
        this.setTitle("Cylinder Form");

        font = new Font("architectural", Font.BOLD, 20);
        buttonFont = new Font("segoe ui", Font.PLAIN, 14);

        cylinderContainer = this.getContentPane();
        cylinderContainer.setLayout(null);
        cylinderContainer.setBackground(Color.cyan);

        provideInfo = new JLabel("We provide Cash on delivery.All you need to do is fill up this form.");
        provideInfo.setBounds(10, 10, 746, 50);
        provideInfo.setFont(font);
        cylinderContainer.add(provideInfo);

        //final int[] available_cylinders = {300};
        //available = new JLabel("Total Available Cylinders : "+ available_cylinders[0]);
        available = new JLabel("Total Available Cylinders : 300");
        available.setBounds(10, 60, 746, 50);
        available.setFont(font);
        cylinderContainer.add(available);



        lblCylinderInfo = new JLabel("Select The Quantity in litre.");
        lblCylinderInfo.setFont(font);
        lblCylinderInfo.setBounds(20,110,300,50);
        cylinderContainer.add(lblCylinderInfo);

        buttongroup = new ButtonGroup();

        Ten = new JRadioButton("Ten Litre");
        Ten.setFont(font);
        Ten.setBounds(325,110,150,50);
        Ten.setBackground(Color.darkGray);
        Ten.setForeground(Color.red);
        cylinderContainer.add(Ten);

        Twenty = new JRadioButton("Twenty Litre");
        Twenty.setFont(font);
        Twenty.setBounds(480,110,150,50);
        Twenty.setBackground(Color.darkGray);
        Twenty.setForeground(Color.red);
        cylinderContainer.add(Twenty);


        buttongroup.add(Ten);
        buttongroup.add(Twenty);


        quantity = new JLabel("Quantity: ");
        quantity.setBounds(40, 160, 100, 40);
        quantity.setFont(font);
        cylinderContainer.add(quantity);


        tfQuantity = new JTextField();
        tfQuantity.setText("Null");
        tfQuantity.setBounds(145, 160, 120, 40);

        cylinderContainer.add(tfQuantity);

        Ten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==Ten)
                {
                    String S = "Ten Litres";
                    tfQuantity.setText(S);
                }
            }
        });

        Twenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==Twenty)
                {
                    String S = "Twenty Litres";
                    tfQuantity.setText(S);
                }
            }
        });


        name = new JLabel("Name: ");
        name.setBounds(40, 200, 90, 40);
        name.setFont(font);
        cylinderContainer.add(name);

        tfName = new JTextField();
        tfName.setBounds(145, 200, 120, 40);
        cylinderContainer.add(tfName);

        address = new JLabel("Address: ");
        address.setBounds(40, 240, 100, 40);
        address.setFont(font);
        cylinderContainer.add(address);

        tfAddress = new JTextField();
        tfAddress.setBounds(145, 240, 120, 40);
        cylinderContainer.add(tfAddress);

        phone = new JLabel("Phone: ");
        phone.setBounds(40, 280, 90, 40);
        phone.setFont(font);
        cylinderContainer.add(phone);

        tfPhone = new JTextField();
        tfPhone.setBounds(145, 280, 120, 40);
        cylinderContainer.add(tfPhone);

        submit = new JButton("Get");
        submit.setBounds(175, 330, 90, 40);
        submit.setFont(buttonFont);
        submit.setBackground(Color.PINK);
        cylinderContainer.add(submit);

       // for (int i = 0; i< available_cylinders[0]; i--)
        //{
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Submitted in Database.");

                int i=300;
                available.setText("Total Available Cylinders : "+i--);

                //available_cylinders[0]--;
               }

                //SQL
           // }
        });


    }
};



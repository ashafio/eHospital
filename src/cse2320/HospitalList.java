package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HospitalList extends JFrame {
    public Container hospitalContainer;



    HospitalList()
    {
        hospitalcomponents();
    }
    public void hospitalcomponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,20,766,700);
        this.setTitle("Hospital List");

        hospitalContainer = this.getContentPane();
        hospitalContainer.setLayout(null);
        hospitalContainer.setBackground(Color.cyan);


    };
}

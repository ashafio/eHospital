package cse2320;

import javax.swing.*;
import java.awt.*;

public class BookAppointment extends JFrame {
    public Container appointmentContainer;
    public Font font,buttonFont;

    BookAppointment()
    {
        appointmentcomponents();
    }
    public void appointmentcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(433, 20, 500, 700);
        this.setTitle("Medicine");

        font = new Font("architectural", Font.BOLD, 20);
        buttonFont = new Font("segoe ui", Font.PLAIN, 14);

        appointmentContainer = this.getContentPane();
        appointmentContainer.setLayout(null);
        appointmentContainer.setBackground(Color.decode("#3ad2ff"));


    }};

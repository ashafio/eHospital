package cse2320;

import javax.swing.*;
import java.awt.*;

public class FeedBack extends JFrame {

    public Container nc;
    public JLabel welcome;
    public JLabel cmntreq;
    public JTextArea ta;
    public JButton submit;
    public Font f2;

    FeedBack()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,600,550);
        this.setTitle("New Frame");

        f2 = new Font("Segoe Script",Font.PLAIN,18);

        nc=this.getContentPane();
        nc.setLayout(null);
        nc.setBackground(Color.GRAY);

        welcome = new JLabel("Hello.");
        cmntreq = new JLabel("Please, write and submit your comment below.");

        welcome.setBounds(50,50,500,50);
        welcome.setFont(f2);
        nc.add(welcome);

        cmntreq.setBounds(50,120,500,50);
        cmntreq.setFont(f2);
        nc.add(cmntreq);

        ta = new JTextArea("Write your comment here...");
        ta.setFont(f2);
        ta.setBounds(50,200,480,250);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        nc.add(ta);

        submit = new JButton("Submit");
        submit.setBounds(450,460,80,50);
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        nc.add(submit);

    }
}

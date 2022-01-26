package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Request extends JFrame{
    public JLabel welcomeLabel,loginLabel,registerLabel,iconLabel;
    public ImageIcon welcomeImg;
    public Container requestContainer;
    public JButton loginButton,registerButton;
    public Font font,buttonFont;

    Request()
    {
        requestcomponents();
    }
    public void requestcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,20,766,700);
        this.setTitle("Login and Register Request");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.PLAIN,14);

        requestContainer = this.getContentPane();
        requestContainer.setLayout(null);
        requestContainer.setBackground(Color.cyan);

        welcomeImg = new ImageIcon(getClass().getResource("telemedicine.png"));
        iconLabel = new JLabel(welcomeImg);
        iconLabel.setBounds(100,10,540,500);
        iconLabel.setBackground(Color.cyan);
        requestContainer.add(iconLabel);

        welcomeLabel = new JLabel("Hi. Welcome to eHospital.");
        welcomeLabel.setBounds(250,510,400,50);
        welcomeLabel.setForeground(Color.white);
        welcomeLabel.setFont(font);
        requestContainer.add(welcomeLabel);

        loginLabel = new JLabel("Already Have an Account? Click ");
        loginLabel.setBounds(120,560,366,50);
        loginLabel.setFont(font);
        requestContainer.add(loginLabel);

        loginButton = new JButton("Login");
        loginButton.setBounds(490,560,90,40);
        loginButton.setBackground(Color.pink);
        loginButton.setFont(buttonFont);
        requestContainer.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login login = new Login();
                login.setVisible(true);
            }
        });

        registerLabel = new JLabel("If You're New Here,Click ");
        registerLabel.setBounds(120,610,366,50);
        registerLabel.setFont(font);
        requestContainer.add(registerLabel);

        registerButton = new JButton("Register");
        registerButton.setBounds(490,610,90,40);
        registerButton.setBackground(Color.pink);
        registerButton.setFont(buttonFont);
        requestContainer.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Register register = new Register();
                register.setVisible(true);
            }
        });






    }


}

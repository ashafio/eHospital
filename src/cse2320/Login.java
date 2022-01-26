package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    public Container loginContainer;
    public Font font,buttonFont;
    public JLabel userLabel,passLabel;
    public JTextField userTextField;
    public JPasswordField passTextField;
    public JButton loginButton,cancelButton;

    Login()
    {
        logincomponents();
    }
    public void logincomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,20,566,700);
        this.setTitle("Login Here");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.PLAIN,14);

        loginContainer = this.getContentPane();
        loginContainer.setLayout(null);
        loginContainer.setBackground(Color.pink);

        userLabel = new JLabel("Username: ");
        userLabel.setBounds(50,50,150,50);
        userLabel.setFont(font);
        loginContainer.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(170,50,200,50);
        userTextField.setFont(font);
        loginContainer.add(userTextField);

        passLabel = new JLabel("Password: ");
        passLabel.setBounds(50,120,150,50);
        passLabel.setFont(font);
        loginContainer.add(passLabel);

        passTextField = new JPasswordField();
        passTextField.setBounds(170,120,200,50);
        passTextField.setFont(font);
        passTextField.setEchoChar('*');
        loginContainer.add(passTextField);

        loginButton = new JButton("Login");
        loginButton.setBounds(170,190,90,50);
        loginButton.setFont(buttonFont);
        loginButton.setBackground(Color.CYAN);
        loginContainer.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = passTextField.getText();

                //Will add sql later

                if(username.equals("ashafio") && password.equals("1234"))
                {
                    JOptionPane.showMessageDialog(null,"Login Successful !!!");
                    dispose();
                    Home home = new Home();
                    home.setVisible(true);

                }

                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password. :(");
                }
            }
        });

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(280,190,90,50);
        cancelButton.setFont(buttonFont);
        cancelButton.setBackground(Color.CYAN);
        loginContainer.add(cancelButton);

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Request goback = new Request();
                goback.setVisible(true);
            }
        });
    }
}

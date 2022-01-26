package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Register extends JFrame{
    public Container registerContainer;
    public Font font,buttonFont;
    public JLabel nameLabel,dobLabel,nidLabel,bloodGroupLabel,locationLabel,phoneLabel,emailLabel,setUserLabel,setPassLabel;
    public JTextField nameField,dobField,nidField,bloodGroupField,locationField,phoneField,emailField,setUserField;
    public JPasswordField setPasswordField;
    public JButton submitButton,cancelButton;

    Register() throws SQLException, ClassNotFoundException {
        registercomponents();
    }
    public void registercomponents() throws ClassNotFoundException, SQLException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(380,20,580,700);
        this.setTitle("Register Here");

        //Scanner input = new Scanner(System.in);

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.PLAIN,14);

        registerContainer = this.getContentPane();
        registerContainer.setLayout(null);
        registerContainer.setBackground(Color.pink);


//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/register";
//        String url = "jdbc:mysql://localhost:3306/pass";
//        Connection con = DriverManager.getConnection(url,"root","");
//        Statement st = con.createStatement();




        nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(20,20,260,60);
        nameLabel.setFont(font);
        registerContainer.add(nameLabel);

        dobLabel = new JLabel("Birthday(ex:02-11-2000) :");
        dobLabel.setBounds(20,80,263,60);
        dobLabel.setFont(font);
        registerContainer.add(dobLabel);

        nidLabel = new JLabel("NID Number: ");
        nidLabel.setBounds(20,140,263,60);
        nidLabel.setFont(font);
        registerContainer.add(nidLabel);

        bloodGroupLabel = new JLabel("Blood Group: ");
        bloodGroupLabel.setBounds(20,200,263,60);
        bloodGroupLabel.setFont(font);
        registerContainer.add(bloodGroupLabel);

        locationLabel = new JLabel("Location: ");
        locationLabel.setBounds(20,260,263,60);
        locationLabel.setFont(font);
        registerContainer.add(locationLabel);

        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(20,320,263,60);
        phoneLabel.setFont(font);
        registerContainer.add(phoneLabel);

        emailLabel = new JLabel("E-mail");
        emailLabel.setBounds(20,380,263,60);
        emailLabel.setFont(font);
        registerContainer.add(emailLabel);

        setUserLabel = new JLabel("Set Username: ");
        setUserLabel.setBounds(20,440,263,60);
        setUserLabel.setFont(font);
        registerContainer.add(setUserLabel);

        setPassLabel = new JLabel("Set Password");
        setPassLabel.setBounds(20,500,263,60);
        setPassLabel.setFont(font);
        registerContainer.add(setPassLabel);



        nameField = new JTextField();
        nameField.setBounds(285,20,263,50);
        nameField.setFont(font);
        registerContainer.add(nameField);

        dobField = new JTextField();
        dobField.setBounds(285,80,263,50);
        dobField.setFont(font);
        registerContainer.add(dobField);

        nidField = new JTextField();
        nidField.setBounds(285,140,263,50);
        nidField.setFont(font);
        registerContainer.add(nidField);

        bloodGroupField = new JTextField();
        bloodGroupField.setBounds(285,200,263,50);
        bloodGroupField.setFont(font);
        registerContainer.add(bloodGroupField);

        locationField = new JTextField();
        locationField.setBounds(285,260,263,50);
        locationField.setFont(font);
        registerContainer.add(locationField);

        phoneField = new JTextField();
        phoneField.setBounds(285,320,263,50);
        phoneField.setFont(font);
        registerContainer.add(phoneField);

        emailField = new JTextField();
        emailField.setBounds(285,380,263,50);
        registerContainer.add(emailField);

        setUserField = new JTextField();
        setUserField.setBounds(285,440,263,50);
        setUserField.setFont(font);
        registerContainer.add(setUserField);

        setPasswordField = new JPasswordField();
        setPasswordField.setBounds(285,500,263,50);
        setPasswordField.setFont(font);
        setPasswordField.setEchoChar('*');
        registerContainer.add(setPasswordField);


        submitButton = new JButton("Submit");
        submitButton.setBounds(350,570,90,40);
        submitButton.setFont(buttonFont);
        submitButton.setBackground(Color.CYAN);
        registerContainer.add(submitButton);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //String query = "Insert into password values ('"+psftxt+"')";
//                String query = "Insert into info(name,bday,nid,bg,location,phone,email,username,password) values('"+namedb+dobdb+niddb+bgdb+locdb+phndb+emaildb+userdb+passdb+"') ";
//                String query = "INSERT INTO info values('"+namedb+"','"+dobdb+"','"+niddb+"','"+bgdb+"','"+locdb+"','"+phndb+"','"+emaildb+"','"+userdb+"','"+passdb+"')";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/register";
                    Connection con = DriverManager.getConnection(url,"root","");
                    Statement st = con.createStatement();


                    String namedb = new String(nameField.getText());
                    String dobdb = new String(dobField.getText());
                    String niddb = new String(nidField.getText());
                    String bgdb = new String(bloodGroupField.getText());
                    String locdb = new String(locationField.getText());
                    String phndb = new String(phoneField.getText());
                    String emaildb = new String(emailField.getText());
                    String userdb = new String(setUserField.getText());
                    String passdb = new String(setPasswordField.getPassword());



                    String query = "Insert into info values('"+namedb+"','"+dobdb+"','"+niddb+"','"+bgdb+"','"+locdb+"','"+phndb+"','"+emaildb+"','"+userdb+"','"+passdb+"')";
                    String queryreglogin = "Insert into login values('"+userdb+"','"+passdb+"')";
                   // rs = st.executeUpdate(query);
                    st.executeUpdate(query);
                    st.executeUpdate(queryreglogin);
//                    st.close();
//                    con.close();

                } catch (Exception exception)
                {

                }


                dispose();
                JOptionPane.showMessageDialog(null,"Submitted Successfully !!! Now You Can Login.");
                Login login = new Login();
                login.setVisible(true);
            }
        });

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(450,570,90,40);
        cancelButton.setFont(buttonFont);
        cancelButton.setBackground(Color.CYAN);
        registerContainer.add(cancelButton);

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

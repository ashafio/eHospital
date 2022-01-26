package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BloodGet extends JFrame {

    public Container bloodGetContainer;
    public Font font,buttonFont;
    public JLabel fillForm,lblName,lblNID,lblBloodGroup,lblPhone,selectHospital;
    public JComboBox comboBloodGroup,comboHospital;
    public String hospital[] = {"MAG Osmani","PoliceLine","Mount Adora","Al Haramain","Ibn Sina"};
    public String bloodgroups[] = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};

    public JTextField tfName,tfNID,tfPhone;
    public JButton submit;



    BloodGet() {
        blood_get_components();
    }

    public void blood_get_components()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,20,566,700);
        this.setTitle("BloodGet");

                font = new Font("architectural",Font.BOLD,20);
                buttonFont = new Font("segoe ui",Font.BOLD,16);

        bloodGetContainer = this.getContentPane();
        bloodGetContainer.setLayout(null);
        bloodGetContainer.setBackground(Color.cyan);


                fillForm = new JLabel("Fill up this form to get blood.We'll contact you later.");
                fillForm.setFont(font);
                fillForm.setBounds(20,20,720,60);
        bloodGetContainer.add(fillForm);

                lblName = new JLabel("Name: ");
                lblName.setBounds(20,85,60,40);
        bloodGetContainer.add(lblName);

                tfName = new JTextField();
                tfName.setBounds(85,85,150,40);
        bloodGetContainer.add(tfName);

                lblNID = new JLabel("NID: ");
                lblNID.setBounds(20,150,60,40);
        bloodGetContainer.add(lblNID);

                tfNID = new JTextField();
                tfNID.setBounds(85,150,150,40);
        bloodGetContainer.add(tfNID);

                lblPhone = new JLabel("Phone: ");
                lblPhone.setBounds(20,200,60,40);
        bloodGetContainer.add(lblPhone);

                tfPhone = new JTextField();
                tfPhone.setBounds(85,200,150,40);
        bloodGetContainer.add(tfPhone);

                lblBloodGroup = new JLabel("Blood Group: ");
                lblBloodGroup.setBounds(20,240,90,50);
        bloodGetContainer.add(lblBloodGroup);


                comboBloodGroup = new JComboBox(bloodgroups);
                comboBloodGroup.setBounds(115,240,90,40);
        bloodGetContainer.add(comboBloodGroup);

                selectHospital = new JLabel("Select Hospital: ");
                selectHospital.setBounds(20,300,110,50);
        bloodGetContainer.add(selectHospital);

                comboHospital = new JComboBox(hospital);
                comboHospital.setBounds(125,300,90,50);
        bloodGetContainer.add(comboHospital);

                submit = new JButton("Submit");
                submit.setBounds(125,360,90,40);
        bloodGetContainer.add(submit);

                submit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //SQL
                    }
                });


            };
        }


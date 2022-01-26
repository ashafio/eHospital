package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BloodDonate extends JFrame {

    public Container bloodDonateContainer;
    public Font font,buttonFont;
    public JLabel fillForm,lblName,lblNID,lblBloodGroup,lblPhone,selectHospital;
    public JComboBox comboBloodGroup,comboHospital;
    public String hospital[] = {"MAG Osmani","PoliceLine","Mount Adora","Al Haramain","Ibn Sina"};
    public String bloodgroups[] = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};

    public JTextField tfName,tfNID,tfPhone;
    public JButton submit;



    BloodDonate() {
        blood_donate_components();
    }

    public void blood_donate_components()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,20,566,700);
        this.setTitle("BloodDonate");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.BOLD,16);

        bloodDonateContainer = this.getContentPane();
        bloodDonateContainer.setLayout(null);
        bloodDonateContainer.setBackground(Color.cyan);


        fillForm = new JLabel("Fill up this form to donate blood.We'll contact you later.");
        fillForm.setFont(font);
        fillForm.setBounds(20,20,720,60);
        bloodDonateContainer.add(fillForm);

        lblName = new JLabel("Name: ");
        lblName.setBounds(20,85,60,40);
        bloodDonateContainer.add(lblName);

        tfName = new JTextField();
        tfName.setBounds(85,85,150,40);
        bloodDonateContainer.add(tfName);

        lblNID = new JLabel("NID: ");
        lblNID.setBounds(20,150,60,40);
        bloodDonateContainer.add(lblNID);

        tfNID = new JTextField();
        tfNID.setBounds(85,150,150,40);
        bloodDonateContainer.add(tfNID);

        lblPhone = new JLabel("Phone: ");
        lblPhone.setBounds(20,200,60,40);
        bloodDonateContainer.add(lblPhone);

        tfPhone = new JTextField();
        tfPhone.setBounds(85,200,150,40);
        bloodDonateContainer.add(tfPhone);

        lblBloodGroup = new JLabel("Blood Group: ");
        lblBloodGroup.setBounds(20,240,90,50);
        bloodDonateContainer.add(lblBloodGroup);


        comboBloodGroup = new JComboBox(bloodgroups);
        comboBloodGroup.setBounds(115,240,90,40);
        bloodDonateContainer.add(comboBloodGroup);

        selectHospital = new JLabel("Select Hospital: ");
        selectHospital.setBounds(20,300,110,50);
        bloodDonateContainer.add(selectHospital);

        comboHospital = new JComboBox(hospital);
        comboHospital.setBounds(125,300,90,50);
        bloodDonateContainer.add(comboHospital);

        submit = new JButton("Submit");
        submit.setBounds(125,360,90,40);
        bloodDonateContainer.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SQL
            }
        });


    };
}

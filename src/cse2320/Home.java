package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    public Container homeContainer;
    public Font font,buttonFont;
    public ImageIcon imgHospitalList,imgBuyCylinder,imgBlood,imgBookAppointment,imgMedicine,imgTeleMedicine,imgFeedBack,imgGallery,imgAboutus;
    public JButton btnHospitalList,btnBuyCylinder,btnBlood,btnBookAppointment,btnMedicine,btnTeleMedicine,btnFeedBack,btnGallery,btnAboutus;
    public JLabel lblHospitalList,lblBuyCylinder,lblBlood,lblBookAppointment,lblMedicine,lblTeleMedicine,lblFeedback,lblGallery,lblAboutus;

    Home()
    {
        homecomponents();
    }
    public void homecomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(433,20,500,700);
        this.setTitle("Home");

        font = new Font("architectural",Font.BOLD,20);
        buttonFont = new Font("segoe ui",Font.PLAIN,14);

        homeContainer = this.getContentPane();
        homeContainer.setLayout(null);
        homeContainer.setBackground(Color.GRAY);

        imgHospitalList = new ImageIcon(getClass().getResource("hospitallist.png"));
        btnHospitalList = new JButton(imgHospitalList);
        btnHospitalList.setBounds(20,40,130,130);
        homeContainer.add(btnHospitalList);

        btnHospitalList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                HospitalList hospitals = new HospitalList();
                hospitals.setVisible(true);
            }
        });

        lblHospitalList = new JLabel("Hospital List");

        imgBuyCylinder = new ImageIcon(getClass().getResource("oxygen.png"));
        btnBuyCylinder = new JButton(imgBuyCylinder);
        btnBuyCylinder.setBounds(180,40,130,130);
        homeContainer.add(btnBuyCylinder);

        btnBuyCylinder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BuyCylinder cylinders = new BuyCylinder();
                cylinders.setVisible(true);
            }
        });

        lblBuyCylinder = new JLabel("Buy Cylinder");

        imgBlood = new ImageIcon(getClass().getResource("blood.png"));
        btnBlood = new JButton(imgBlood);
        btnBlood.setBounds(320,40,130,130);
        homeContainer.add(btnBlood);

        btnBlood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Blood blood = new Blood();
                blood.setVisible(true);
            }
        });

        lblBlood = new JLabel("Blood Bank");

        imgBookAppointment = new ImageIcon(getClass().getResource("doctor.png"));
        btnBookAppointment = new JButton(imgBookAppointment);
        btnBookAppointment.setBounds(20,180,130,130);
        homeContainer.add(btnBookAppointment);

        btnBookAppointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                BookAppoinment appointment = new BookAppoinment();
                appointment.setVisible(true);
            }
        });

        lblBookAppointment = new JLabel("Book an Appointment");

        imgMedicine = new ImageIcon(getClass().getResource("medicine.png"));
        btnMedicine = new JButton(imgMedicine);
        btnMedicine.setBounds(180,180,130,130);
        homeContainer.add(btnMedicine);

        btnMedicine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Medicine medicine = new Medicine();
                medicine.setVisible(true);
            }
        });

        lblMedicine = new JLabel("Buy Medicine");

        imgTeleMedicine = new ImageIcon(getClass().getResource("telemedicine2.png"));
        btnTeleMedicine= new JButton(imgTeleMedicine);
        btnTeleMedicine.setBounds(320,180,130,130);
        homeContainer.add(btnTeleMedicine);

        btnTeleMedicine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                TeleMedicine telemedicine = new TeleMedicine();
                telemedicine.setVisible(true);
            }
        });

        lblTeleMedicine = new JLabel("TeleMedicine");

        imgFeedBack = new ImageIcon(getClass().getResource("feedback.png"));
        btnFeedBack = new JButton(imgFeedBack);
        btnFeedBack.setBounds(20,320,130,130);
        homeContainer.add(btnFeedBack);

        btnFeedBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                FeedBack feedBack = new FeedBack();
                feedBack.setVisible(true);
            }
        });

        lblFeedback = new JLabel("FeedBack");

        imgGallery = new ImageIcon(getClass().getResource("gallery.png"));
        btnGallery = new JButton(imgGallery);
        btnGallery.setBounds(180,320,130,130);
        homeContainer.add(btnGallery);

        btnGallery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Gallery gallery = new Gallery();
                gallery.setVisible(true);
            }
        });

        lblGallery = new JLabel("Photo Archive");

        imgAboutus = new ImageIcon(getClass().getResource("info.png"));
        btnAboutus = new JButton(imgAboutus);
        btnAboutus.setBounds(320,320,130,130);
        homeContainer.add(btnAboutus);

        btnAboutus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Aboutus aboutus = new Aboutus();
                aboutus.setVisible(true);
            }
        });

        lblAboutus = new JLabel("About us");

}
    }

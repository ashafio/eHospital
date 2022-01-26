package cse2320;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeleMedicine extends JFrame {
    public Container tele_medicineContainer;
    public Font font,buttonFont;
    public JLabel initInstruction,selectCategory;
    public JLabel docta;
    public JComboBox docCombo;
    public String doctype[]={"Cardiologists","Dermatologists","Neurologists","Urologists","Physician"};

    TeleMedicine()
    {
        tele_medicinecomponents();
    }
    public void tele_medicinecomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(233, 20, 900, 700);
        this.setTitle("Medicine");

        font = new Font("architectural", Font.BOLD, 20);
        buttonFont = new Font("segoe ui", Font.PLAIN, 14);

        tele_medicineContainer = this.getContentPane();
        tele_medicineContainer.setLayout(null);
        tele_medicineContainer.setBackground(Color.pink);

        initInstruction = new JLabel("How it works? Select a category -> Select Doctor ->Join using Zoom link.");
        initInstruction.setBounds(10,10,780,50);
        initInstruction.setFont(font);
        tele_medicineContainer.add(initInstruction);

        selectCategory=new JLabel("Select a Category: ");
        selectCategory.setBounds(10,65,250,50);
        selectCategory.setFont(font);
        tele_medicineContainer.add(selectCategory);

        docCombo = new JComboBox(doctype);
        docCombo.setBounds(270,65,100,50);
        tele_medicineContainer.add(docCombo);


        docCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ("Cardiologists".equals(docCombo.getSelectedItem()))
                {
                    docta = new JLabel("Dr Muhammad (Jeebon) MBBS FCPS(medicine)  Zoom: https://bdren.zoom.us/j/68989268480");
                    docta.setFont(font);
                    docta.setBounds(10,70,900,300);
//                    docta.setLineWrap(true);
//                    docta.setWrapStyleWord(true);
                    docta.setBackground(Color.RED);
                    docta.setForeground(Color.BLUE);
                    tele_medicineContainer.add(docta);


                }

                else if ("Dermatologists".equals(docCombo.getSelectedItem()))
                {
                    docta = new JLabel("Dr Ranjon Roy.  MBBS, FCPS(Medicine)  Zoom: https://bdren.zoom.us/j/28989268485");
                    docta.setFont(font);
                    docta.setBounds(10,70,900,300);
//                    docta.setLineWrap(true);
//                    docta.setWrapStyleWord(true);
                    tele_medicineContainer.add(docta);
                }

                else if ("Physician".equals(docCombo.getSelectedItem()))
                {
                    docta = new JLabel("Dr ZHM Nazmul Alam.  MBBS, FCPS (Medicine)  Zoom: https://bdren.zoom.us/j/58989268489");
                    docta.setFont(font);
                    docta.setBounds(10,70,900,300);
//                    docta.setLineWrap(true);
//                    docta.setWrapStyleWord(true);
                    tele_medicineContainer.add(docta);
                }
                else if ("Neurologists".equals(docCombo.getSelectedItem()))
                {
                    docta = new JLabel("Dr Goutam Talukder. MBBS, BCS, FCPS (Medicine) Zoom: https://bdren.zoom.us/j/848892684802");
                    docta.setFont(font);
                    docta.setBounds(10,70,900,300);
//                    docta.setLineWrap(true);
//                    docta.setWrapStyleWord(true);
                    tele_medicineContainer.add(docta);
                }

                else if ("Urologists".equals(docCombo.getSelectedItem()))
                {
                    docta = new JLabel("Dr Md Jalal Hossain  MBBS, FCPS(medicine)  Zoom: https://bdren.zoom.us/j/48659228484");
                    docta.setFont(font);
                    docta.setBounds(10,70,900,300);
//                    docta.setLineWrap(true);
//                    docta.setWrapStyleWord(true);
                    tele_medicineContainer.add(docta);
                }
            }
        });
    }};

package cse2320;

    import java.awt.Color;
    import java.awt.Image;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.*;


    public class Gallery extends JFrame{
        JLabel pic;
        Timer tm;
        int x = 0;
        //Images Path In Array

        String[] list = {
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\0.png",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\1.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\2.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\3.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\4.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\5.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\6.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\7.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\8.jpg",
                "C:\\Users\\hp\\IdeaProjects\\eHospital\\src\\cse2320\\hospitalimg\\9.jpg",
        };

        public Gallery(){
            super("eHospital photo Archive. Affiliated: Mount Adora,Ibn Sina,MAG Osmani,Al Haramain Hospital");
            pic = new JLabel();
            pic.setBounds(40, 30, 700, 300);

            //Call The Function SetImageSize
            SetImageSize(3);
            //set a timer
            tm = new Timer(2000,new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    SetImageSize(x);
                    x += 1;
                    if(x >= list.length )
                        x = 0;
                }
            });
            add(pic);
            tm.start();
            setLayout(null);
            setSize(800, 400);
            getContentPane().setBackground(Color.decode("#3ad2ff"));
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        //create a function to resize the image
        public void SetImageSize(int i){
            ImageIcon icon = new ImageIcon(list[i]);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImc = new ImageIcon(newImg);
            pic.setIcon(newImc);
        }

    }

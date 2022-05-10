import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GUI implements ActionListener {
    JFrame hovedVindu;
    JPanel hovedPanel, oppePanel, verdenPanel, tittelPanel, tomPanel, spill; // TODO
    char rettning; // TODO finish
    JButton opp, ned, hoyre, venstre, slutt;
    JLabel[][] bokser = new JLabel[12][12]; 

    GUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.exit(1);
        }

        tomPanel = new JPanel();
        tomPanel.setSize(700, 900);

        hovedVindu = new JFrame("snake");
        hovedVindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hovedVindu.setSize(700, 900);
        // hovedVindu.setPreferredSize(new Dimension(600, 600));

        hovedPanel = new JPanel();
        hovedPanel.setLayout(new BorderLayout());
        hovedPanel.setSize(700, 900);

        tittelPanel = new JPanel();
        tittelPanel.setSize(500, 30);
        tittelPanel.setBounds(100, 5, 500, 30);
        // tittelPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        //tittelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel testTest = new JLabel("Snake");
        testTest.setHorizontalAlignment(JLabel.CENTER);
        testTest.setVerticalAlignment(JLabel.CENTER);
        testTest.setForeground(Color.green);

        oppePanel = new JPanel();
        oppePanel.setBounds(50, 40, 600, 200);
        oppePanel.setSize(600, 200);
        oppePanel.setLayout(new GridLayout(0,2));
        oppePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        oppePanel.setBackground(Color.gray);

        JLabel lengde = new JLabel("Lengde: 1");
        lengde.setHorizontalAlignment(JLabel.CENTER);
        oppePanel.add(lengde);

        JPanel knapper = new JPanel();
        knapper.setLayout(new BorderLayout());
        opp = new JButton("opp");
        ned = new JButton("ned");
        hoyre = new JButton("hoyre");
        venstre = new JButton("venstre");
        slutt = new JButton("exit");
        knapper.add(opp, BorderLayout.NORTH);
        knapper.add(ned, BorderLayout.SOUTH);
        knapper.add(hoyre, BorderLayout.EAST);
        knapper.add(venstre, BorderLayout.WEST);
        knapper.add(slutt, BorderLayout.CENTER);

        opp.addActionListener(this);
        ned.addActionListener(this);
        hoyre.addActionListener(this);
        venstre.addActionListener(this);
        slutt.addActionListener(this);


        oppePanel.add(knapper);
        
        spill = new JPanel();
        spill.setSize(700, 495);
        spill.setBounds(65, 240, 570, 570);
        spill.setLayout(new GridLayout(12,12));
        spill.setBackground(Color.gray);
        spill.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        for (int y = 1; y <=12; y++) {
            for (int x = 1; x <= 12; x++) {
                JLabel box = new JLabel(" ");
                box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                bokser[y-1][x-1] = box;
                spill.add(box);
            }
        }
        hovedVindu.add(hovedPanel);
        tittelPanel.add(testTest);
        hovedPanel.add(oppePanel);
        hovedPanel.add(spill);
        hovedPanel.add(tittelPanel);
        hovedVindu.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == slutt){
            System.exit(0);
        }
        else if(e.getSource() == opp){
            System.out.println("du trakk opp");
        }
        else if(e.getSource() == ned){
            System.out.println("du trakk ned");
        }
        else if(e.getSource() == hoyre){
            System.out.println("du trakk hoyre");
        }
        else if(e.getSource() == venstre){
            System.out.println("du trakk venstre");
        }
    }

    public void startpos(){
        JLabel start = bokser[6][6];
        //start.setText(text);
    }
}

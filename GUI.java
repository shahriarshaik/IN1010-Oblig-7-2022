import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GUI implements ActionListener {
    JFrame hovedVindu;
    JPanel hovedPanel, oppePanel, verdenPanel, tittelPanel; //TODO 
    //JLabel m;
    char rettning; //TODO finish
    JButton opp, ned, hoyre, venstre, slutt;

    GUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {System.exit(1);}
        hovedVindu = new JFrame("snake");
        hovedVindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //hovedVindu.setPreferredSize(new Dimension(600, 600));
        hovedVindu.setSize(600, 600);;
        hovedVindu.setVisible(true);

        hovedPanel = new JPanel();
        hovedPanel.setLayout(new BorderLayout());
        hovedPanel.setSize(600, 600);
        hovedVindu.add(hovedPanel);

        tittelPanel = new JPanel();
        

        oppePanel = new JPanel();
        oppePanel.setSize(200,600);
        //oppePanel.setForeground(new Color(255, 0, 0));
        //oppePanel.setBackground(new Color(255, 0, 0));
        hovedPanel.add(oppePanel);
        JLabel testTest = new JLabel("print");
        testTest.setForeground(new Color(255, 0, 0));
        oppePanel.add(testTest);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}

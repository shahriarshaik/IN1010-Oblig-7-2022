import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GUI implements ActionListener {
    JFrame hovedVindu;
    JPanel hovedPanel, oppePanel, verdenPanel, tittelPanel, tomPanel; // TODO
    // JLabel m;
    char rettning; // TODO finish
    JButton opp, ned, hoyre, venstre, slutt;

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
        tittelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        JLabel testTest = new JLabel("Snake");
        testTest.setHorizontalAlignment(JLabel.CENTER);
        testTest.setVerticalAlignment(JLabel.CENTER);
        testTest.setForeground(Color.green);

        oppePanel = new JPanel();
        oppePanel.setSize(600, 200);
        oppePanel.setBounds(50, 60, 600, 200);
        oppePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        oppePanel.setBackground(Color.gray);

        // oppePanel.setForeground(new Color(255, 0, 0));
        // oppePanel.setBackground(new Color(255, 0, 0));

        hovedVindu.add(hovedPanel);
        // hovedPanel.add(tomPanel);
        tittelPanel.add(testTest);
        hovedPanel.add(oppePanel);
        hovedPanel.add(tittelPanel);
        hovedVindu.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}

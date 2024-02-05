package teste;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class layout {
    public static void main(String[] args) {
        //panels 
        JFrame frame = new JFrame();
        JLabel label = new JLabel("novo texto");
        label.setBounds(75, 75, 30, 30);

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel.setBackground(Color.red);
        panel.setBounds(0, 0, 150, 150);
        panel.setLayout(null);

        panel2.setBackground(Color.green);
        panel2.setBounds(0, 150, 150, 150);
        panel2.setLayout(null);

        panel3.setBackground(Color.blue);
        panel3.setBounds(150, 0, 300, 300);;
        panel3.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700, 700);
        panel.setLayout(new BorderLayout());

        panel.add(label);



        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);

        frame.setVisible(true);
    }
}

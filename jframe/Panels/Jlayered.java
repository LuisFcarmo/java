package Panels;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Jlayered {
    public static void main(String[] args) {    
        JLayeredPane apanel = new JLayeredPane();
        apanel.setBounds(0, 0, 600, 600);

        JFrame frame = new JFrame("Jlayeredpanel");
        frame.add(apanel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        frame.setLayout(null);
        JLabel a1 = new JLabel();
        a1.setOpaque(true);
        a1.setBounds(50, 50, 200, 200);
        a1.setBackground(Color.GREEN);

        JLabel a2 = new JLabel();
        a2.setOpaque(true);
        a2.setBounds(100, 100, 200, 200);
        a2.setBackground(Color.blue);

        JLabel a3 = new JLabel();
        a3.setOpaque(true);
        a3.setBounds(150, 150, 200, 200);
        a3.setBackground(Color.CYAN);

        JLabel a4 = new JLabel();
        a4.setOpaque(true);
        a4.setBounds(200, 200, 200, 200);
        a4.setBackground(Color.DARK_GRAY);
    
        
        apanel.add(a1, Integer.valueOf(0));
        apanel.add(a2, Integer.valueOf(0));
        apanel.add(a3, Integer.valueOf(1));
        apanel.add(a4, Integer.valueOf(2));

        frame.setVisible(true);
    }
}

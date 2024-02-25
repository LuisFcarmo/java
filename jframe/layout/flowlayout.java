package layout;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowlayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0, 0));  

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));        
        panel.add(new JButton("2"));        
        panel.add(new JButton("3"));        
        panel.add(new JButton("4"));        
        panel.add(new JButton("5"));        
        panel.add(new JButton("6"));        
        panel.add(new JButton("7"));        
        panel.add(new JButton("8"));        
        panel.add(new JButton("9"));        


        frame.add(panel);
        frame.setVisible(true);
    }
}

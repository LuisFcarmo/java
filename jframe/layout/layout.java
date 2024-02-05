package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class layout {
    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        myframe.setSize(500, 500);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setLayout(new BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.MAGENTA);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.DARK_GRAY);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.blue);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.ORANGE);
        
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.green);
        panel5.setLayout(new BorderLayout(4, 4));


        //sub panels
        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.black);

        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.green);

        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.red);

        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.lightGray);
        
        JPanel panel10 = new JPanel();

        panel10.setBackground(Color.darkGray);


        panel6.setPreferredSize(new Dimension(10, 10));
        panel7.setPreferredSize(new Dimension(10, 10));
        panel8.setPreferredSize(new Dimension(10, 10));
        panel9.setPreferredSize(new Dimension(10, 10));
        panel10.setPreferredSize(new Dimension(10, 10));

        
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.CENTER);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.SOUTH);        

        //

        myframe.add(panel1, BorderLayout.NORTH);
        myframe.add(panel2, BorderLayout.WEST);
        myframe.add(panel3, BorderLayout.CENTER);
        myframe.add(panel4, BorderLayout.EAST);
        myframe.add(panel5, BorderLayout.SOUTH);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        myframe.setVisible(true);

    }


}

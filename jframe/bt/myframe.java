package bt;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myframe extends JFrame implements ActionListener {
    JButton button = new JButton();
    JLabel label;

    myframe () {
        label = new JLabel("lhe amo");
        label.setBounds(250, 250, 100, 100);
        label.setOpaque(true);
        label.setBackground(Color.red);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.black);
        label.setVisible(false);
        


        button.setBounds(200, 200, 100, 100);
        button.addActionListener(this);
        button.setText("sabia que ?");
        button.setFocusable(false);
        button.setForeground(Color.cyan);
        button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void myframe_cap() {
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int pressed = e.getKeyCode();
            }            
        });
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("lhe amo !");
            button.setBounds(0, 0, 190, 190);
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

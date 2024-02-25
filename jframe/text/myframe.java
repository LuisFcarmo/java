package text;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import layout.flowlayout;


public class myframe extends JFrame implements ActionListener {
    JButton bt = new JButton("mandar");
    JTextField textfild = new JTextField();

    myframe () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        bt.addActionListener(this);
        
        textfild.setPreferredSize(new Dimension(250, 40));
        textfild.setFont(new Font("Consolas", Font.BOLD, 35));
        textfild.setForeground(Color.GREEN);
        textfild.setBackground(Color.GRAY); 
        textfild.setCaretColor(Color.white);
        textfild.setText("username");

        this.add(textfild);
        this.add(bt);
        this.pack();
        this.setVisible(true);  
    };
    @Override
    public void actionPerformed (ActionEvent x) {
        if(x.getSource() == bt) {
            System.err.println("welcome bro " + textfild.getText());
        }
    }
}

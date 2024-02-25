package bt;

import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class frame extends JFrame implements ActionListener{
    JButton bt;
    JCheckBox checkbox;

    frame () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        checkbox = new JCheckBox();
        checkbox.setText("Não sou um robo");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.BOLD, 23));
        bt = new JButton();
        bt.setText("clica aqui pra tu ver");
        bt.addActionListener(this);
        
        this.add(bt);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent x) {
        if (x.getSource() == bt) {
           System.out.println(checkbox.isSelected());
        }
    }
}

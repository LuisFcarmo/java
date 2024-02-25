package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton b1 = new JButton("New window");

    LaunchPage () {
        b1.setBounds(100, 160, 200, 40);
        b1.setFocusable(false);
        b1.addActionListener(this);

        frame.add(b1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            frame.dispose();
            NewWindon mywindow = new NewWindon();
        }
    }

}

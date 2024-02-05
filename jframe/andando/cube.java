package andando;

import java.awt.Color;

import javax.swing.JPanel;

public class cube {
    JPanel cubo = new JPanel();

    cube () {
        cubo.setSize(30, 30);
        cubo.setBackground(Color.gray);
        cubo.setBounds(0, 0, 30, 30);
        cubo.setVisible(true);
    }

    void set_position (int x, int y) {
        System.out.printf("x = %d y = %d\n", x, y);
        cubo.setBounds(x, y, 30, 30);;        
    }
    int get_x () {
        return cubo.getX();
    }
    int get_y () {
        return cubo.getY();
    }
}

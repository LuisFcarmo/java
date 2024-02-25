package objetos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class game_window extends JFrame {
    public static JFrame g_window;
    public static JPanel map;
    public static JPanel title;

    game_window () {
        g_window = new JFrame();
        g_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        g_window.setSize(defines.max_Window_size, defines.max_Window_size);
        g_window.setLayout(new BorderLayout(0, 0));   
        g_window.setResizable(false);
    }

    void create_map () {
        /* 
         * map of the game 
        */
        map = new JPanel();
        title = new JPanel();
        title.setPreferredSize(new Dimension(50, 50));
        title.setBackground(Color.black);
        
        JPanel unable_area1 = new JPanel();
        unable_area1.setPreferredSize(new Dimension(50, 50));
        unable_area1.setBackground(Color.black);
        
        JPanel unable_area2 = new JPanel();
        unable_area2.setPreferredSize(new Dimension(50, 50));
        unable_area2.setBackground(Color.black);

        JPanel unable_area3 = new JPanel();
        unable_area3.setPreferredSize(new Dimension(50, 50));
        unable_area3.setBackground(Color.black);
 
        map.setPreferredSize(new Dimension(defines.max_map_size, defines.max_map_size));
        map.setBackground(defines.map_color);
        map.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        map.setLayout(null);

        g_window.add(map, BorderLayout.CENTER);
        g_window.add(title, BorderLayout.NORTH);
        g_window.add(unable_area1, BorderLayout.WEST);
        g_window.add(unable_area2, BorderLayout.EAST);
        g_window.add(unable_area3, BorderLayout.SOUTH);
    }
    

    void init_components () {
        create_map();

        g_window.setVisible(true);
    }
}

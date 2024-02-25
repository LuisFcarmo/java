package objetos;
import java.awt.Color;
import java.util.*;
import javax.swing.JPanel;

public class food {
    JPanel food;

    food () {
        food =  new JPanel();
        food.setBackground(Color.blue);
        food.setBounds(0, 0, 400, 400);
    };

    void Spawn () {
        Random ran = new Random();
        int x = ran.nextInt(defines.max_map_size);
        int y = ran.nextInt(defines.max_map_size);
        food.setBounds(x, y, defines.food_size, defines.food_size);
        food.setVisible(true);

        game_window.map.add(food);
    }
    
    int get_cord_x (){
        return food.getX();
    }
    int get_cord_y (){
        return food.getY();
    }
}
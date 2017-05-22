/**
 * Created by Lenovo on 21.5.2017 г..
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JWindow{
    JPanel panel = new Panel();

    public Window(){
        panel.setBackground(Color.PINK);
        add(panel);
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    dispose();
                }
            }
        });
    }
    public static void main(String[] args) {
        Window w = new Window();
        w.setSize(1200, 600);
        w.setVisible(true);
    }
}

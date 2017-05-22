import javax.swing.*;
import java.awt.*;

/**
 * Created by Lenovo on 22.5.2017 г..
 */
public class Button {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                JFrame frame = new JFrame();
                JButton button = new JButton("Accept");
                frame.add(button);
                //button.setFont(new Font("Serif", Font.BOLD, 18));
                button.setEnabled(true); //dali moje da se click-ne na nego ili ne :D
                button.setIcon(new ImageIcon(Button.class.getResource("com/icon/check.jpg")));

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

/**
 * Created by Lenovo on 21.5.2017 г..
 */

import javax.swing.*;
import java.awt.*;

public class Label {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel demo");
        JLabel label = new JLabel();
        label.setText("Heyaa yoyo");
        label.setFont(new Font("Consolas", Font.PLAIN, 24));
        //label.setIcon(new ImageIcon("E:/kk17/LastIphonePh/IMG_2381.jpg"));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

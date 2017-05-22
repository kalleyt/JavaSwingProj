/**
 * Created by Lenovo on 21.5.2017 г..
 */
import javafx.embed.swing.JFXPanel;

import javax.swing.JFrame;

public class Frame {

    public static void main(String[] args) {
        //JFrame

        JFrame frame = new JFrame("JFrame demo");
        Panel panel = new Panel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //defines how the app ends
        frame.setSize(320,240);
        frame.setVisible(true);

    }

}


import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;

/**
 * Created by Lenovo on 22.5.2017 г..
 */
public class TextField {

    JFrame frame = new JFrame("JTextField demo");
    JTextField textField = new JTextField("Hello there from JTextField", 10);

    TextField(){
        //textField.setFont(new Font("Verdana", Font.BOLD, 18));
        //textField.setEditable(false);
        //textField.setEnabled(false);
        textField.setText("This is a new text");
        String s = textField.getText();
        System.out.println(s);
        frame.setTitle(s);

        frame.add(textField);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });

    }
}

import javax.swing.*;

/**
 * Created by Lenovo on 22.5.2017 г..
 */
public class NumberTextField {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JNumberTextField num = new JNumberTextField();
                num.setColumns(15); //width of text field
                num.setFormat(JNumberTextField.DECIMAL);
                num.setMaxLength(8);
                num.setPrecision(4);
                num.setAllowNegative(true);

                JFrame frame = new JFrame();
                frame.add(num);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

/**
 * Created by Lenovo on 21.5.2017 г..
 */

import javax.swing.*;

public class SplitPane extends JFrame{

    JLabel leftLabel = new JLabel();
    JLabel rightLabel = new JLabel();

    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftLabel), new JScrollPane(rightLabel));

    public SplitPane(){
        leftLabel.setIcon(new ImageIcon("E:/kk17/LastIphonePh/IMG_3065.png"));
        rightLabel.setIcon(new ImageIcon("E:/kk17/LastIphonePh/IMG_3105.png"));
        add(splitPane);
    }

    public static void main(String[] args) {
        SplitPane sp = new SplitPane();
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(500, 300);
        sp.setVisible(true);
    }
}

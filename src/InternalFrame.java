import javax.swing.*;

/**
 * Created by Lenovo on 21.5.2017 г..
 */


public class InternalFrame extends JFrame{
    JDesktopPane desktopPane = new JDesktopPane();
    JInternalFrame internalFrame = new JInternalFrame("JInternalFrame demo");

    InternalFrame(){
        internalFrame.setMaximizable(true); // to maximize the internal frame
        internalFrame.setIconifiable(true); //to minimiza the internal frame
        internalFrame.setResizable(true);
        internalFrame.setClosable(true);
        internalFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        internalFrame.setSize(320,240);
        internalFrame.setVisible(true);

        desktopPane.add(internalFrame);
        add(desktopPane);
    }

    public static void main(String[] args) {
        InternalFrame iFrame = new InternalFrame();
        iFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iFrame.setSize(640, 480);
        iFrame.setVisible(true);
    }
}

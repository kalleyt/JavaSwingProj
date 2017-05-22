/**
 * Created by Lenovo on 21.5.2017 г..
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel{
    BufferedImage image;

    public Panel(){
        try {
            image = ImageIO.read(new File("E:/kk17/LastIphonePh/IMG_2381.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g){
       // g.drawImage(image, 0, 0, null);
        g.setColor(Color.pink);
        g.fillRect(10, 10, 100, 50);
    }
}

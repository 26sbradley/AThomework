import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Board extends JComponent {

    private BufferedImage image;

    public Board() {
        try {
            image = ImageIO.read(new File("Andy.png"));
        } catch (IOException e) {
            System.out.println("Image not found!");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Cyan background
        g2.setColor(Color.CYAN);
        g2.fillRect(0, 0, getWidth(), getHeight());

        if (image != null) {
            
            int imgW = getWidth() / 4;
            int imgH = getHeight() / 4;

            // Translate to bottom right corner
            AffineTransform at = new AffineTransform();
            at.translate(getWidth() - imgW, getHeight() - imgH);
            at.scale((double) imgW / image.getWidth(), (double) imgH / image.getHeight());

            g2.drawImage(image, at, null);
        }
    }
}
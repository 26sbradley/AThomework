import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class AnimatedBoard extends JComponent implements Runnable {

    private BufferedImage image;
    private double x, y;
    private double speedX = 1, speedY = 1;
    private double angle = 0;
    private final int SIZE = 720;
    private int imgW, imgH;

    public AnimatedBoard() {
        try {
            image = ImageIO.read(new File("Andy.png"));
        } catch (IOException e) {
            System.out.println("Image not found!");
        }

        // Image size = 1/4 of board
        imgW = SIZE / 4;
        imgH = SIZE / 4;

        // Start at upper left corner (center of image at 0,0)
        x = 0;
        y = 0;

        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            // Move
            x += speedX;
            y += speedY;
            angle += 5;

            // Wrap around
            if (x > SIZE) x = 0;
            if (y > SIZE) y = 0;
            if (x < 0) x = SIZE;
            if (y < 0) y = SIZE;

            repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {}
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(Color.CYAN);
        g2.fillRect(0, 0, SIZE, SIZE);

        if (image != null) {
            AffineTransform at = new AffineTransform();

            // Translate to current position
            at.translate(x, y);

            // Rotate clockwise around center of image
            at.rotate(Math.toRadians(angle), imgW / 2.0, imgH / 2.0);

            // Scale image to 1/4 board size
            at.scale((double) imgW / image.getWidth(), (double) imgH / image.getHeight());

            g2.drawImage(image, at, null);
        }
    }
}
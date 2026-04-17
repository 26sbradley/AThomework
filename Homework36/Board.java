import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g2.setColor(Color.CYAN);
        g2.fillRect(0, 0, 350, 350);

        // Center
        int cx = 175;
        int cy = 175;

        g2.translate(cx, cy);
        g2.rotate(Math.toRadians(22.5));

        // Pink filled rectangle
        g2.setColor(Color.PINK);
        g2.fillRect(-75, -75, 150, 150);

        // Black border
        g2.setColor(Color.BLACK);
        g2.drawRect(-75, -75, 150, 150);

        // Reset transform before drawing text
        g2.rotate(-Math.toRadians(22.5));
        g2.translate(-cx, -cy);

        // Hello world in blue
        g2.setColor(Color.BLUE);
        g2.setFont(new Font("Arial", Font.PLAIN, 20));
        g2.drawString("Hello, world!", 10, 25);
    }
}
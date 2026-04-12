import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsTemplate {

    public static void draw(Graphics g) {

        // Sky
        g.setColor(new Color(255, 100, 50));
        g.fillRect(0, 0, 400, 200);

        // Ocean
        g.setColor(new Color(30, 100, 180));
        g.fillRect(0, 200, 400, 120);

        // Beach
        g.setColor(new Color(240, 210, 130));
        g.fillRect(0, 300, 400, 100);

        // Sun
        g.setColor(new Color(255, 240, 50));
        g.fillOval(160, 80, 80, 80);

        // Sailboat hull
        g.setColor(new Color(180, 80, 40));
        g.fillPolygon(new int[]{230, 300, 290, 240}, new int[]{215, 215, 230, 230}, 4);

        // Sailboat mast
        g.setColor(Color.DARK_GRAY);
        g.fillRect(263, 185, 3, 32);

        // Sailboat sail
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[]{266, 266, 295}, new int[]{187, 213, 213}, 3);

    
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }

    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Graphics Template");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }
}
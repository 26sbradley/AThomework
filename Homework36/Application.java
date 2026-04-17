import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board();
        board.setPreferredSize(new Dimension(350, 350));

        frame.add(board);
        frame.pack();
        frame.setVisible(true);
    }
}
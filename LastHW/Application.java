import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {

        // Part A
        JFrame frameA = new JFrame("Part A - Image");
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board board = new Board();
        board.setPreferredSize(new Dimension(350, 350));
        frameA.add(board);
        frameA.pack();
        frameA.setVisible(true);

        // Part B
        JFrame frameB = new JFrame("Part B - Animated Andy");
        frameB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AnimatedBoard animBoard = new AnimatedBoard();
        animBoard.setPreferredSize(new Dimension(720, 720));
        frameB.add(animBoard);
        frameB.pack();
        frameB.setVisible(true);
    }
}
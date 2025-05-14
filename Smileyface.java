import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);  // Face

        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 20, 30);   // Left eye
        g.fillOval(190, 100, 20, 30);  // Right eye

        g.drawArc(100, 130, 100, 70, 0, -180);  // Smile
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face Drawing");
        SmileyFace panel = new SmileyFace();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

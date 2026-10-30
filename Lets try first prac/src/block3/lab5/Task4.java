package block3.lab5;

import javax.swing.*;
import java.awt.*;

public class Task4 extends JPanel {
    private final ImageIcon gif;       // анимированный GIF
    private int posX = 50, posY = 50;
    private int dx = 5, dy = 5;

    public Task4(String path) {
        gif = new ImageIcon(path);
        setPreferredSize(new Dimension(600, 400));

        new Timer(30, e -> {
            posX += dx;
            posY += dy;

            int w = gif.getIconWidth();
            int h = gif.getIconHeight();

            if (posX <= 0) { posX = 0; dx = Math.abs(dx); }
            else if (posX + w >= getWidth()) { posX = getWidth() - w; dx = -Math.abs(dx); }

            if (posY <= 0) { posY = 0; dy = Math.abs(dy); }
            else if (posY + h >= getHeight()) { posY = getHeight() - h; dy = -Math.abs(dy); }

            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        gif.paintIcon(this, g, posX, posY);   // рисует текущий кадр GIF
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Использование: java Task4_Animation <путь к .gif>");
            return;
        }
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GIF bounce");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Task4(args[0]));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

package block3.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task3 extends JPanel {
    private final BufferedImage image;

    public Task3(BufferedImage image) {
        this.image = image;
        setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Использование: java Task3 <путь к картинке>");
            return;
        }
        try {
            BufferedImage img = ImageIO.read(new File(args[0]));
            if (img == null) {
                System.out.println("Файл не является изображением: " + args[0]);
                return;
            }
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame(args[0]);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(new Task3(img)));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }
    }
}

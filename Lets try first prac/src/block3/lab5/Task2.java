package block3.lab5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics2D g);
}

class Circle extends Shape {
    private final int radius;

    Circle(Color c, int x, int y, int radius) {
        super(c, x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private final int w, h;

    Rectangle(Color c, int x, int y, int w, int h) {
        super(c, x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }
}

class Triangle extends Shape {
    private final int size;

    Triangle(Color c, int x, int y, int size) {
        super(c, x, y);
        this.size = size;
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        int[] xs = {x, x + size, x + size / 2};
        int[] ys = {y + size, y + size, y};
        g.fillPolygon(xs, ys, 3);
    }
}

public class Task2 extends JPanel {
    private static final int W = 700, H = 500;
    private final List<Shape> shapes = new ArrayList<>();

    public Task2() {
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            Color color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            int x = rnd.nextInt(W - 100);
            int y = rnd.nextInt(H - 100);
            int size = 30 + rnd.nextInt(60);

            switch (rnd.nextInt(3)) {
                case 0 -> shapes.add(new Circle(color, x, y, size / 2));
                case 1 -> shapes.add(new Rectangle(color, x, y, size, size * 2 / 3));
                default -> shapes.add(new Triangle(color, x, y, size));
            }
        }
        setPreferredSize(new Dimension(W, H));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (Shape s : shapes) {
            s.draw(g2);   // полиморфизм: вызывается draw нужного класса
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("20 random shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Task2());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

package block3.lab15;

import javax.swing.*;
import java.awt.*;

/** Задание 4: калькулятор как на рис. 15.10. */
public class Task4 extends JFrame {
    private final JTextField display = new JTextField("0");

    private double left = 0;          // накопленное значение
    private String op = null;         // ожидающая операция
    private boolean newNumber = true; // следующая цифра начинает новое число

    public Task4() {
        super("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("SansSerif", Font.PLAIN, 28));
        add(display, BorderLayout.NORTH);

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        JPanel grid = new JPanel(new GridLayout(4, 4, 8, 8));
        for (String text : labels) {
            JButton b = new JButton(text);
            b.addActionListener(e -> onButton(text));
            grid.add(b);
        }
        add(grid, BorderLayout.CENTER);

        JLabel title = new JLabel("Simple Calculator", SwingConstants.CENTER);
        add(title, BorderLayout.SOUTH);

        setSize(320, 360);
        setLocationRelativeTo(null);
    }

    private void onButton(String cmd) {
        if (cmd.matches("[0-9]")) {
            if (newNumber || display.getText().equals("0")) {
                display.setText(cmd);
            } else {
                display.setText(display.getText() + cmd);
            }
            newNumber = false;
        } else if (cmd.equals(".")) {
            if (newNumber) {
                display.setText("0.");
                newNumber = false;
            } else if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        } else if (cmd.equals("=")) {
            if (op != null) {
                calculate();
                op = null;
            }
            newNumber = true;
        } else {                       // + - * /
            if (op != null && !newNumber) {
                calculate();           // цепочка: 2 + 3 + ...
            } else {
                left = current();
            }
            if (!display.getText().equals("Error")) {
                op = cmd;
            }
            newNumber = true;
        }
    }

    private void calculate() {
        double right = current();
        switch (op) {
            case "+": left += right; break;
            case "-": left -= right; break;
            case "*": left *= right; break;
            case "/":
                if (right == 0) {
                    display.setText("Error");
                    left = 0;
                    op = null;
                    newNumber = true;
                    return;
                }
                left /= right;
                break;
        }
        display.setText(format(left));
    }

    /** Число с экрана (0, если там "Error"). */
    private double current() {
        try {
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private String format(double v) {
        if (v == Math.rint(v) && Math.abs(v) < 1e15) {
            return String.valueOf((long) v);   // 5.0 -> 5
        }
        return String.valueOf(v);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task4().setVisible(true));
    }
}

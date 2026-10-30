package block3.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private final JTextField field1 = new JTextField(10);
    private final JTextField field2 = new JTextField(10);

    public Task1() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 170);
        setLocationRelativeTo(null);

        add(new JLabel("1st Number"));
        add(field1);
        add(new JLabel("2nd Number"));
        add(field2);

        // по кнопке на каждую операцию
        for (String op : new String[]{"+", "-", "*", "/"}) {
            add(createButton(op));
        }
        setVisible(true);
    }

    private JButton createButton(final String op) {
        JButton button = new JButton(op);
        button.setPreferredSize(new Dimension(50, 30));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(op);
            }
        });
        return button;
    }

    private void calculate(String op) {
        try {
            double x1 = Double.parseDouble(field1.getText().trim().replace(',', '.'));
            double x2 = Double.parseDouble(field2.getText().trim().replace(',', '.'));
            double result;
            switch (op) {
                case "+": result = x1 + x2; break;
                case "-": result = x1 - x2; break;
                case "*": result = x1 * x2; break;
                case "/":
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(this, "Division by zero!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = x1 / x2;
                    break;
                default: return;
            }
            JOptionPane.showMessageDialog(this, "Result = " + result,
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error in Numbers !",
                    "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Task1::new);
    }
}

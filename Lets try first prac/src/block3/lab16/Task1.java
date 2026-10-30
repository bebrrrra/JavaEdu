package block3.lab16;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task1 extends JFrame {
    private static final int MAX_ATTEMPTS = 3;

    private final int secret = new Random().nextInt(21);   // 0..20 включительно
    private int attempts = 0;

    private final JLabel info = new JLabel("Угадайте число от 0 до 20. Попыток: " + MAX_ATTEMPTS,
            SwingConstants.CENTER);
    private final JTextField input = new JTextField(10);
    private final JButton guessButton = new JButton("Угадать");

    public Task1() {
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel bottom = new JPanel(new FlowLayout());
        bottom.add(input);
        bottom.add(guessButton);

        add(info, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        guessButton.addActionListener(e -> checkGuess());
        input.addActionListener(e -> checkGuess());   // Enter тоже работает

        setSize(400, 150);
        setLocationRelativeTo(null);
    }

    private void checkGuess() {
        int guess;
        try {
            guess = Integer.parseInt(input.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите целое число от 0 до 20!",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;                                   // неверный ввод попыткой не считается
        }
        if (guess < 0 || guess > 20) {
            JOptionPane.showMessageDialog(this, "Число должно быть от 0 до 20!",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        attempts++;

        if (guess == secret) {
            JOptionPane.showMessageDialog(this, "Поздравляем, вы угадали число " + secret + "!");
            System.exit(0);
        }

        if (attempts >= MAX_ATTEMPTS) {
            JOptionPane.showMessageDialog(this,
                    "Попытки закончились. Было загадано число " + secret + ".");
            System.exit(0);
        }

        String hint = secret < guess ? "меньше" : "больше";
        JOptionPane.showMessageDialog(this,
                "Вы ошиблись: загаданное число " + hint + ". Осталось попыток: "
                        + (MAX_ATTEMPTS - attempts));
        info.setText("Осталось попыток: " + (MAX_ATTEMPTS - attempts));
        input.setText("");
        input.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task1().setVisible(true));
    }
}

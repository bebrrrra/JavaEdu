package block3.lab5;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {
    private int milanGoals = 0;
    private int madridGoals = 0;

    private final JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private final JLabel scorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private final JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public Task1() {
        super("Milan vs Real Madrid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        // Кнопки сверху
        JPanel buttons = new JPanel(new GridLayout(1, 2, 10, 10));
        buttons.add(milanButton);
        buttons.add(madridButton);

        // Надписи по центру
        JPanel labels = new JPanel(new GridLayout(3, 1));
        labels.add(resultLabel);
        labels.add(scorerLabel);
        labels.add(winnerLabel);

        add(buttons, BorderLayout.NORTH);
        add(labels, BorderLayout.CENTER);

        // Обработчики нажатий
        milanButton.addActionListener(e -> {
            milanGoals++;
            update("AC Milan");
        });
        madridButton.addActionListener(e -> {
            madridGoals++;
            update("Real Madrid");
        });

        setSize(350, 200);
        setLocationRelativeTo(null);
    }

    private void update(String scorer) {
        resultLabel.setText("Result: " + milanGoals + " X " + madridGoals);
        scorerLabel.setText("Last Scorer: " + scorer);

        String winner;
        if (milanGoals > madridGoals) winner = "AC Milan";
        else if (madridGoals > milanGoals) winner = "Real Madrid";
        else winner = "DRAW";
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task1().setVisible(true));
    }
}

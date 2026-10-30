package block3.lab15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {
    private final String[] countries = {"Australia", "China", "England", "Russia"};
    private final String[] info = {
            "Australia\nСтолица: Канберра\nНаселение: около 27 млн\nЯзык: английский",
            "China\nСтолица: Пекин\nНаселение: около 1,4 млрд\nЯзык: китайский",
            "England\nСтолица: Лондон\nНаселение: около 57 млн\nЯзык: английский",
            "Russia\nСтолица: Москва\nНаселение: около 146 млн\nЯзык: русский"
    };

    public Task2() {
        super("Hello Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        JComboBox<String> comboBox = new JComboBox<>(countries);
        JTextArea infoArea = new JTextArea(info[0], 5, 25);
        infoArea.setEditable(false);

        // выбор пункта -> показать информацию о стране
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoArea.setText(info[comboBox.getSelectedIndex()]);
            }
        });

        add(comboBox, BorderLayout.NORTH);
        add(new JScrollPane(infoArea), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task2().setVisible(true));
    }
}
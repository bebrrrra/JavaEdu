package block3.lab15;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/** Задание 3: меню (Файл, Правка, Справка), две кнопки и текстовое поле. */
public class Task3 extends JFrame {
    private final JTextArea textArea = new JTextArea("This is the area you can write text.", 10, 30);

    public Task3() {
        super("Hello Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setJMenuBar(createMenuBar());

        // две кнопки сверху
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        button1.addActionListener(e -> textArea.append("\nНажата кнопка 1"));
        button2.addActionListener(e -> textArea.append("\nНажата кнопка 2"));

        JPanel buttons = new JPanel(new GridLayout(1, 2, 10, 10));
        buttons.add(button1);
        buttons.add(button2);

        add(buttons, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private JMenuBar createMenuBar() {
        JMenuBar bar = new JMenuBar();

        // Файл: Сохранить, Выйти
        JMenu file = new JMenu("Файл");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
        save.addActionListener(e -> saveToFile());
        exit.addActionListener(e -> System.exit(0));
        file.add(save);
        file.addSeparator();
        file.add(exit);

        // Правка: Копировать, Вырезать, Вставить
        JMenu edit = new JMenu("Правка");
        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");
        copy.addActionListener(e -> textArea.copy());
        cut.addActionListener(e -> textArea.cut());
        paste.addActionListener(e -> textArea.paste());
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        // Справка
        JMenu help = new JMenu("Справка");
        JMenuItem about = new JMenuItem("О программе");
        about.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Практическая работа №15, задание 3", "О программе",
                JOptionPane.INFORMATION_MESSAGE));
        help.add(about);

        bar.add(file);
        bar.add(edit);
        bar.add(help);
        return bar;
    }

    /** Сохраняет текст из поля в файл, выбранный пользователем. */
    private void saveToFile() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                Files.write(f.toPath(), textArea.getText().getBytes(StandardCharsets.UTF_8));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Не удалось сохранить файл: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task3().setVisible(true));
    }
}

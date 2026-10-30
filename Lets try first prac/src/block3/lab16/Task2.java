package block3.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/** BorderLayout с подписями в каждой области; при входе мыши - диалог. */
public class Task2 extends JFrame {
    private long lastDialogClosed = 0;   // защита от повторного срабатывания после закрытия диалога

    public Task2() {
        super("Округа Москвы");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        addRegion(BorderLayout.CENTER, "CENTER", "Добро пожаловать в ЦАО", new Color(255, 230, 230));
        addRegion(BorderLayout.WEST,   "WEST",   "Добро пожаловать в ЗАО", new Color(230, 255, 230));
        addRegion(BorderLayout.SOUTH,  "SOUTH",  "Добро пожаловать ЮАО",   new Color(230, 230, 255));
        addRegion(BorderLayout.NORTH,  "NORTH",  "Добро пожаловать в САО", new Color(255, 255, 220));
        addRegion(BorderLayout.EAST,   "EAST",   "Добро пожаловать в ВАО", new Color(230, 255, 255));

        setSize(500, 400);
        setLocationRelativeTo(null);
    }

    /** Создаёт подпись для области и вешает на неё слушатель мыши (анонимный класс). */
    private void addRegion(String position, String title, String message, Color bg) {
        JLabel label = new JLabel(title, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(bg);
        label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        label.setPreferredSize(new Dimension(120, 60));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // после закрытия диалога мышь может "войти" снова - игнорируем
                if (System.currentTimeMillis() - lastDialogClosed < 500) return;
                JOptionPane.showMessageDialog(Task2.this, message);
                lastDialogClosed = System.currentTimeMillis();
            }
        });
        add(label, position);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Task2().setVisible(true));
    }
}

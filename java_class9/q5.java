import java.awt.*;
import javax.swing.*;

public class q5 extends JFrame {
    private JComboBox<Integer> red, green, blue;

    public q5() {
        setTitle("Color Selector");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        red = createComboBox("Red");
        green = createComboBox("Green");
        blue = createComboBox("Blue");

        JButton btn = new JButton("Show Output");
        btn.addActionListener(e -> getContentPane().setBackground(
                new Color((int) red.getSelectedItem(), (int) green.getSelectedItem(), (int) blue.getSelectedItem())
        ));
        add(btn);
    }

    private JComboBox<Integer> createComboBox(String label) {
        add(new JLabel(label));
        JComboBox<Integer> combo = new JComboBox<>();
        for (int i = 0; i < 256; i++) combo.addItem(i);
        add(combo);
        return combo;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q5().setVisible(true));
    }
}

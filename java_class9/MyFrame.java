import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener 
{
    JPanel panel;
    JComboBox<String> colorBox;
    JButton btn;

    public MyFrame() {
        setTitle("My Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();

        String[] colors = { "Red", "Green", "Blue", "Yellow" };
        colorBox = new JComboBox<>(colors);

        btn = new JButton("Change Color");
        btn.addActionListener(this);

        add(colorBox, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String color = (String) colorBox.getSelectedItem();

        if (color != null) 
	{
            switch (color) {
                case "Red":
                    panel.setBackground(Color.RED);
                    break;
                case "Green":
                    panel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    panel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    panel.setBackground(Color.YELLOW);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
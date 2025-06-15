import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q6 extends JFrame implements ActionListener {
    JTextField display;
    double num1, num2;
    String operator;

    public q6() {
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }
        add(panel);

        JButton offButton = new JButton("OFF");
        offButton.addActionListener(e -> System.exit(0));
        add(offButton, BorderLayout.SOUTH);

        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.matches("[0-9.]")) {
            display.setText(display.getText() + command);
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": display.setText(String.valueOf(num1 + num2)); break;
                case "-": display.setText(String.valueOf(num1 - num2)); break;
                case "*": display.setText(String.valueOf(num1 * num2)); break;
                case "/": display.setText(String.valueOf(num1 / num2)); break;
            }
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new q6().setVisible(true);
    }
}

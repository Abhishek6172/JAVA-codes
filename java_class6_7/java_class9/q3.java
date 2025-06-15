package JAVA.java_class6_7.java_class9;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class C extends JFrame implements ActionListener {
 
    String[] cols = {"Red", "Green", "Blue", "Yellow"};
    JList<String> lst = new JList<>(cols);  
    JButton btn = new JButton("Change");
    JPanel pnl = new JPanel();

    
    public C(String t) {
        setLayout(new BorderLayout());
        add(new JScrollPane(lst), BorderLayout.NORTH);
        add(btn, BorderLayout.CENTER);
        add(pnl, BorderLayout.SOUTH);
        pnl.setPreferredSize(new Dimension(300, 100));

        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sel = lst.getSelectedValue();

        if (sel != null) {
            switch (sel) {
                case "Red":
                    pnl.setBackground(Color.RED);
                    break;
                case "Green":
                    pnl.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    pnl.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    pnl.setBackground(Color.YELLOW);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a color first!");
        }
    }
    public static void main(String[] args) {
        C f = new C("Color Changer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}

package JAVA.java_class6_7.java_class9;
import javax.swing.*;
public class q1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Reg Form");
        f.setSize(400, 500);
        f.setLayout(null);
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);
        JLabel l2 = new JLabel("Address:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);
        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(50, 200, 100, 30);
        f.add(l3);
        JLabel l4 = new JLabel("Image:");
        l4.setBounds(50, 350, 100, 30);
        f.add(l4);
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 50, 150, 30);
        f.add(tf1);
        JTextArea ta = new JTextArea();
        ta.setBounds(150, 100, 150, 60);
        f.add(ta);
        JCheckBox cb = new JCheckBox("Agree to terms");
        cb.setBounds(50, 300, 150, 30);
        f.add(cb);
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(150, 200, 70, 30);
        f.add(rb1);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(230, 200, 70, 30);
        f.add(rb2);
        JButton btn = new JButton("Submit");
        btn.setBounds(150, 400, 100, 30);
        f.add(btn);
        f.setVisible(true);
    }
}
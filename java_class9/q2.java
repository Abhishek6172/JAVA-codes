import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class S extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Enter 1st Number:");
    JLabel l2 = new JLabel("Enter 2nd Number:");
    JLabel l3 = new JLabel("Result:");
    
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);

    JButton bAdd = new JButton("Add");
    JButton bMul = new JButton("Mul");
    JButton bSub = new JButton("Sub");
    JButton bReset = new JButton("Reset");
    
    public S(String f) {  
        super(f);
        setLayout(new FlowLayout());
        
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);

        add(bAdd); add(bSub); add(bMul); add(bReset);
        
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x, y, result;
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());

            if (e.getSource() == bAdd) {
                result = x + y;
                t3.setText(String.valueOf(result));
            } 
            else if (e.getSource() == bSub) {
                result = x - y;
                t3.setText(String.valueOf(result));
            } 
            else if (e.getSource() == bMul) {
                result = x * y;
                t3.setText(String.valueOf(result));
            } 
            else if (e.getSource() == bReset) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }

        } catch (Exception ex) {
            t3.setText("Invalid input!");
        }
    }

    public static void main(String args[]) {
        S f = new S("Mini Calculator");
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

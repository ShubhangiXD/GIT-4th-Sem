import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class awt_checkbox extends JFrame implements ActionListener {
    JFrame frame;
    JButton sub;
    JCheckBox name1, name2, name3;

    public void init() {
        name1 = new JCheckBox("Ram");
        name2 = new JCheckBox("Shyam");
        name3 = new JCheckBox("Ramesh");
        sub = new JButton("Submit");
        sub.setBounds(100, 100, 80, 30);
        name1.setBounds(100, 50, 100, 30);
        name2.setBounds(100, 75, 100, 30);
        name3.setBounds(100, 100, 100, 30);
        add(name1);
        add(name2);
        add(name3);
        add(sub);
        sub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == sub)
            repaint();
    }
    public static void main(String args[]) {
        new awt_checkbox();
    }
}
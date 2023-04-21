import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class awt_textarea extends JFrame implements ActionListener {
    // to take textarea for username and password
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    awt_textarea() {
        l1 = new Label("Username");
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label("Password");
        l2.setBounds(50, 100, 100, 30);
        t1 = new TextField();
        t1.setBounds(150, 50, 100, 30);
        t2 = new TextField();
        t2.setBounds(150, 100, 100, 30);
        b1 = new Button("Submit");
        b1.setBounds(100, 150, 80, 30);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);

        b1.addActionListener(this);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String username = t1.getText();
        String password = t2.getText();
    }

    public static void main(String args[]) {
        new awt_textarea();
    }
}
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class awt_radio extends JFrame implements ActionListener {

    JFrame frame;
    JRadioButton red, green, blue;

    awt_radio() {
        frame = new JFrame("Background Change");
        Color c = new Color(255, 255, 255);

        red = new JRadioButton("RED");
        red.setBounds(10, 50, 100, 40);
        red.setBackground(c);

        green = new JRadioButton("GREEN");
        green.setBounds(120, 50, 100, 40);
        green.setBackground(c);

        blue = new JRadioButton("BLUE");
        blue.setBounds(230, 50, 100, 40);
        blue.setBackground(c);

        frame.add(red);
        frame.add(green);
        frame.add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == red)
            frame.getContentPane().setBackground(Color.RED);
        if (ae.getSource() == green)
            frame.getContentPane().setBackground(Color.GREEN);
        if (ae.getSource() == blue)
            frame.getContentPane().setBackground(Color.BLUE);

    }

    public static void main(String[] args) {
        new awt_radio();
    }

}
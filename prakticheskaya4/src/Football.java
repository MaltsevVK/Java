package prakt4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Football extends JFrame {
    private JButton butMil = new JButton("AC Milan");
    private JButton butReal = new JButton("Real Madrid");
    private JLabel labRes = new JLabel();
    private JLabel labLastSc = new JLabel();
    private JLabel labWin = new JLabel();
    private int Milan = 0, Real = 0;

    public Football() {
        super("Real vs AC Milan");
        this.setBounds(500,500,300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.setLayout(null);

        butMil.addActionListener(new ButtonEventListener());
        butMil.setBounds(5,10,130,70);
        container.add(butMil);

        butReal.addActionListener(new ButtonEventListener2());
        butReal.setBounds(150,10,130,70);
        container.add(butReal);

        labRes.setBounds(5,85,100,30);
        container.add(labRes);
        labLastSc.setBounds(5,105,140,30);
        container.add(labLastSc);
        labWin.setBounds(5,125,135,30);
        container.add(labWin);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Milan++;
            pop("AC Milan");
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Real++;
            pop("Real Madrid");
        }
    }
    private void pop(String last) {
        labLastSc.setText("Last Scorer: "+ last);
        labRes.setText("Result: " + Milan + " X " + Real);
        String w = "DRAW";
        if (Milan > Real) {
            w = "AC Mialan";
        }
        else if (Real > Milan) {
            w = "Real Madrid";
        }
        labWin.setText("Winner: " + w);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Football();
            }
        });
    }
}
package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Football extends JFrame {
    private JButton butMil = new JButton("AC Milan");
    private JButton butReal = new JButton("Real Madrid");
    private JLabel labRes = new JLabel();
    private JLabel labLastSc = new JLabel();
    private JLabel labWin = new JLabel();

    private int mil = 0, real = 0;

    public Football () {
        super("Real VS Milan");
        this.setBounds(500,500,300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        Container container = this.getContentPane();
        container.setLayout(null);

        butMil.addActionListener(new ButtonEventListener());
        butReal.addActionListener(new ButtonEventListener2());

        butMil.setBounds(5,10,130,70);
        container.add(butMil);
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
            mil++;
            pop("AC Milan");
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            real++;
            pop("Real Madrid");
        }
    }
    private void pop(String last){
        labLastSc.setText("Last Scorer: " + last);
        labRes.setText("Result: " + mil + " X " + real);
        String w = "DRAW";
        if(mil > real) {
            w = "AC Milan";
        }
        else if (real > mil) {
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
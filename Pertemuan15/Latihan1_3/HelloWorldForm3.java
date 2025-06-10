package src.Pertemuan15.Latihan1_3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class HelloWorldForm3 extends JFrame implements ActionListener {
        private JLabel label; // //2
        private JButton button;

        public HelloWorldForm3() {
            label = new JLabel();
            label.setText("Hello world!");

            button = new JButton("Klik Me!");
            button.addActionListener(this); // event listener

            setLayout(new GridLayout(2, 1));
            add(label);
            add(button);

            setTitle("My First Program");
            setSize(300, 200);
            setVisible(true); // tampilan muncul
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Hallo Dunia!");
        }
    }



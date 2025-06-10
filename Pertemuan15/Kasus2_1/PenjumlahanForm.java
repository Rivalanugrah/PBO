package src.Pertemuan15.Kasus2_1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class PenjumlahanForm extends JFrame implements ActionListener {
        private JTextField input1, input2;
        private JButton tombolJumlah;

        public PenjumlahanForm() {
            // Komponen
            input1 = new JTextField(10);
            input2 = new JTextField(10);
            tombolJumlah = new JButton("Jumlah");

            // Tambahkan aksi pada tombol
            tombolJumlah.addActionListener(this);

            // Layout
            setLayout(new GridLayout(3, 1));
            add(input1);
            add(input2);
            add(tombolJumlah);

            // Properti form
            setTitle("Penjumlahan");
            setSize(300, 150);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 + angka2;

                JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Program utama
        public static void main(String[] args) {
            new PenjumlahanForm();
        }
    }



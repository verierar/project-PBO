package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Balok implements ActionListener {
    public JLabel label1, label2, label3, label4, label5,label6;
    public JTextField textField1, textField2, textField3, textField4, textField5;
    public JButton button,button2,button3,button4;
    

    public Balok() {
        label6 = new JLabel("APLIKASI MENGHITUNG LUAS DAN KELILING BALOK");
        label6.setLocation(50, 5);
        label6.setSize(label6.getPreferredSize());

        label1 = new JLabel("Panjang");
        label1.setLocation(75, 50);
        label1.setSize(label1.getPreferredSize());

        textField1 = new JTextField(20);
        textField1.setLocation(75, 65);
        textField1.setSize(textField1.getPreferredSize());

        label2 = new JLabel("Lebar");
        label2.setLocation(75, 85);
        label2.setSize(label2.getPreferredSize());

        textField2 = new JTextField(20);
        textField2.setLocation(75, 100);
        textField2.setSize(textField2.getPreferredSize());

        label3 = new JLabel("Tinggi");
        label3.setLocation(75, 120);
        label3.setSize(label3.getPreferredSize());

        textField3 = new JTextField(20);
        textField3.setLocation(75, 135);
        textField3.setSize(textField3.getPreferredSize());

        label4 = new JLabel("Luas Balok");
        label4.setLocation(75, 175);
        label4.setSize(label4.getPreferredSize());

        textField4 = new JTextField(20);
        textField4.setLocation(10, 190);
        textField4.setSize(textField4.getPreferredSize());

        label5 = new JLabel("Keliling Balok");
        label5.setLocation(75, 225);
        label5.setSize(label5.getPreferredSize());

        textField5 = new JTextField(20);
        textField5.setLocation(10, 245);
        textField5.setSize(textField5.getPreferredSize());

        button = new JButton("Hitung Luas Balok");
        button.setLocation(245, 185);
        button.setSize(button.getPreferredSize());
        button.addActionListener(this);
        button.setMnemonic('V');

        button2 = new JButton("Hitung Keliling Balok");
        button2.setLocation(243, 240);
        button2.setSize(button2.getPreferredSize());
        button2.addActionListener(this);
        button2.setMnemonic('V');

        button3 = new JButton("Hapus");
        button3.setLocation(50, 280);
        button3.setSize(button2.getPreferredSize());
        button3.addActionListener(this);
        button3.setMnemonic('H');

        button4 = new JButton("Exit");
        button4.setLocation(220, 280);
        button4.setSize(button2.getPreferredSize());
        button4.addActionListener(this);
        button4.setMnemonic('E');
    }

    public void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("APLIKASI MENGHITUNG LUAS DAN KELILING BALOK");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(label6);
        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(textField2);
        frame.getContentPane().add(label3);
        frame.getContentPane().add(textField3);
        frame.getContentPane().add(label4);
        frame.getContentPane().add(textField4);
        frame.getContentPane().add(label5);
        frame.getContentPane().add(textField5);
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);

        frame.setBounds(0, 0, 425, 400);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        double p=0.0, l=0.0, t=0.0, hasil=0.0;

        try {
            p = Double.parseDouble(textField1.getText());
            l = Double.parseDouble(textField2.getText());
            t = Double.parseDouble(textField3.getText());
        } catch(NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        JButton btn = (JButton) event.getSource();
        if(btn == button) {
            hasil = 2*(p*l + p*t + t*l);
            textField4.setText(new String().valueOf(hasil));
        }
        if(btn == button2) {
            hasil = 4*(p+l+t);
            textField5.setText(new String().valueOf(hasil));
        }
        if(btn == button3){
            textField1.setText(null);
            textField2.setText(null);
            textField3.setText(null);
            textField4.setText(null);
            textField5.setText(null);
        }
        if (btn == button4){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Balok app = new Balok();
                app.createAndShowGUI();
            }
        });
    }
}
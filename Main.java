import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Aplikasi Hitung Sederhana");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Masukkan angka pertama");
        JLabel label2 = new JLabel("Masukkan angka kedua");
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));

        JButton addButton = new JButton("Tambah");
        JButton subtractButton = new JButton("Kurang");
        JButton multiplyButton = new JButton("Kali");
        JButton divideButton = new JButton("Bagi");

        JLabel resultLabel = new JLabel("Hasil");
        JTextField field3 = new JTextField(10);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double angka1 = Double.parseDouble(field1.getText());
                double angka2 = Double.parseDouble(field2.getText());
                double hasil = angka1 + angka2;
                resultLabel.setText("Hasil: " + hasil);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double angka1 = Double.parseDouble(field1.getText());
                double angka2 = Double.parseDouble(field2.getText());
                double hasil = angka1 - angka2;
                resultLabel.setText("Hasil: " + hasil);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double angka1 = Double.parseDouble(field1.getText());
                double angka2 = Double.parseDouble(field2.getText());
                double hasil = angka1 * angka2;
                resultLabel.setText("Hasil: " + hasil);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double angka1 = Double.parseDouble(field1.getText());
                double angka2 = Double.parseDouble(field2.getText());
                if (angka2 == 0) {
                    resultLabel.setText("Error: Tidak dapat melakukan pembagian dengan nol!");
                } else {
                    double hasil = angka1 / angka2;
                    resultLabel.setText("Hasil: " + hasil);
                }
            }
        });

        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        frame.setLayout(new GridLayout(7, 1));
        frame.add(label1);
        frame.add(field1);
        frame.add(label2);
        frame.add(field2);
        frame.add(buttonPanel);
        frame.add(resultLabel);
        frame.add(field3);

        frame.setVisible(true);
    }

    public static Hitung hitung(int pil) {
        switch (pil) {
            case 1:
                return new Tambah();
            case 2:
                return new Kurang();
            case 3:
                return new Kali();
            case 4:
                return new Bagi();
            default:
                return null;
        }
    }
}

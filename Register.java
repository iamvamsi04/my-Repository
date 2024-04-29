import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register extends JFrame {
    public Register() {
        setTitle("Registration Form");
        setSize(350, 390);
        setLayout(null);

        JLabel[] labels = {
                new JLabel("First Name"), new JLabel("Last Name"),
                new JLabel("Email"), new JLabel("Phone No"),
                new JLabel("Gender"), new JLabel("Date of Birth"),
                new JLabel("Username"), new JLabel("Password")
        };

        JTextField[] fields = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            labels[i].setBounds(20, 50 + i * 30, 80, 20);
            fields[i] = new JTextField();
            fields[i].setBounds(120, 50 + i * 30, i == 3 ? 85 : 180, 20);
            add(labels[i]); add(fields[i]);
        }

        JComboBox<String> cCode = new JComboBox<>(new String[]{"+91"});
        cCode.setBounds(120, 140, 45, 20); add(cCode);

        JComboBox<String> selGen = new JComboBox<>(new String[]{"Male", "Female"});
        selGen.setBounds(120, 170, 70, 20); add(selGen);

        JComboBox<String> selDay = new JComboBox<>();
        for (int i = 1; i <= 31; i++) selDay.addItem(Integer.toString(i));
        selDay.setBounds(120, 200, 45, 20); add(selDay);

        JComboBox<String> selMonth = new JComboBox<>();
        for (int i = 1; i <= 12; i++) selMonth.addItem(Integer.toString(i));
        selMonth.setBounds(170, 200, 55, 20); add(selMonth);

        JComboBox<String> selYear = new JComboBox<>();
        for (int i = 1980; i <= 2005; i++) selYear.addItem(Integer.toString(i));
        selYear.setBounds(230, 200, 55, 20); add(selYear);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 330, 80, 20); add(submit);

        JLabel success = new JLabel();
        success.setBounds(90, 300, 200, 20); add(success);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (FileWriter write = new FileWriter("Login.txt", true)) {
                    write.write(fields[6].getText() + "\t" + fields[7].getText() + "\n");
                    write.close();
                    success.setText("You're registered Successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Register();
    }
}

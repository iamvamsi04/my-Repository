import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIdemo extends JFrame implements ActionListener {
    JLabel name, password, error;
    JTextField A, B;
    JButton submit;

    GUIdemo() {
        name = new JLabel("username");
        A = new JTextField();
        password = new JLabel("Password");
        B = new JTextField();
        submit = new JButton("submit");
        error = new JLabel("");

        submit.addActionListener(this); // Set action listener to this

        this.add(name);
        this.add(A);
        this.add(password);
        this.add(B);
        this.add(submit);
        this.add(error); // Add the error label

        this.setSize(500, 500);
        this.setLayout(new GridLayout(6, 1)); // Specify rows and columns
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent obj) {
        // Retrieve text from text fields
        String username = A.getText();
        String enteredPassword = B.getText();

        // Check username and password
        if ("vamsi".equals(username) && "123".equals(enteredPassword)) {
            error.setText("correct password");
        } else {
            error.setText("incorrect password");
        }
    }

    public static void main(String[] args) {
        GUIdemo obj = new GUIdemo();
    }
}

package furniture.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    JLabel label1,label2,label3 ;
    JTextField textField1;
    JPasswordField passwordField;

    JButton b1;

    Login()  {

        super("Furniture Management System");

        label1 = new JLabel("Welcome User ...");
        label1.setForeground(Color.black);
        label1.setFont(new Font("AvantGarde",Font.BOLD,32));
        label1.setBounds(25,4,450,38);
        add(label1);

        label2 = new JLabel("User Name");
        label2.setForeground(Color.black);
        label2.setFont(new Font("AvantGarde",Font.BOLD,20));
        label2.setBounds(350,150,450,50);
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(525,155,230,30);
        textField1.setFont(new Font("Arial",Font.BOLD,12));
        add(textField1);


        label3 = new JLabel("Password");
        label3.setForeground(Color.black);
        label3.setFont(new Font("AvantGarde",Font.BOLD,20));
        label3.setBounds(350,200,450,50);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(525,205,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,12));
        add(passwordField);

        b1 = new JButton("Login");
        b1.setForeground(Color.black);
        b1.setBounds(550,300,190,30);
        b1.setFont(new Font("Arial",Font.BOLD,12));
        add(b1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/chair.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,850,480);
        add(image);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if username or password is empty
                String username = textField1.getText();
                String password = new String(passwordField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    // Show an error message
                    JOptionPane.showMessageDialog(Login.this, "Username and password are required.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("seraan") && password.equals("123")) {
                    // Valid input, proceed to open the dashboard page


                    ProductDisplay p1 = new ProductDisplay();
                    p1.setVisible(true);
                    // Dashboard dashboard = new Dashboard();
                    //dashboard.setVisible(true);

                    // Dispose the current Login frame
                    dispose();
                } else {
                    // Show an error message for invalid credentials
                    JOptionPane.showMessageDialog(Login.this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel lUser = new JLabel("Username");
    JLabel lPassword = new JLabel("Password");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton btnLogin = new JButton("Login");
    JButton btnReset = new JButton("Reset");
    public LoginFrame(){
        setTitle("Login form");
        setVisible(true);
        setBounds(10,10,370,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane();

        lUser.setBounds(50,150,100,30);
        lPassword.setBounds(50,220,100,30);
        username.setBounds(150,150,150,30);
        password.setBounds(150,220,150,30);
        btnLogin.setBounds(50,300,100,30);
        btnReset.setBounds(200,300,100,30);
        add(lUser);
        add(lPassword);
        add(username);
        add(password);
        add(btnLogin);
        add(btnReset);
        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
        setLayout(null);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == btnLogin) {
            String userText;
            String pwdText;
            userText = username.getText();
            pwdText = password.getText();
            if (userText.equals("admin") && pwdText.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                new Main();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        //Coding Part of RESET button
        if (e.getSource() == btnReset) {
            username.setText("");
            password.setText("");
        }
    }
}

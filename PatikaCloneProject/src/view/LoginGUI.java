package view;

import helper.Config;
import helper.Helper;
import model.Educator;
import model.Operator;
import model.Student;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbuttom;
    private JTextField fld_user_uname;
    private JButton btn_login;
    private JPasswordField fld_user_pass;
    private JButton btn_signin;

    public LoginGUI() {
        wrapper = new JPanel();
        wtop = new JPanel();
        wbuttom = new JPanel();

        wtop.add(new JLabel("Username: "));
        fld_user_uname = new JTextField(20);
        wtop.add(fld_user_uname);
        wtop.add(new JLabel("Password: "));
        fld_user_pass = new JPasswordField(20);
        wtop.add(fld_user_pass);
        btn_login = new JButton("Log in");
        wtop.add(btn_login);

        wrapper.setLayout(new GridLayout(2, 1)); // 2 satır, 1 sütunlu bir GridLayout kullanalım
        wrapper.add(wtop);
        wrapper.add(wbuttom);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)) {
                    Helper.showMsg("fill");
                } else {
                    User user = User.getFetch(fld_user_uname.getText(), fld_user_pass.getText());
                    if (user == null) {
                        Helper.showMsg("Kullanıcı Bulunamadı!");
                    } else {
                        switch (user.getType()) {
                            case "operator":
                                OperatorGUI operatorGUI = new OperatorGUI((Operator) user);
                                break;
                            case "educator":
                                EducatorGUI educatorGUI = new EducatorGUI((Educator) user);
                                break;
                            case "student":
                                StudentGUI studentGUI = new StudentGUI((Student) user);
                                break;
                        }
                        dispose();
                    }
                }
            }
        });

        btn_signin = new JButton("Sign In");
        btn_signin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignInGUI signInGui = new SignInGUI();
                dispose();
            }
        });

        wbuttom.add(btn_signin);

        add(wrapper);
        pack(); // içerikleri otomatik boyutlandır
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        setVisible(true);
    }

    private void createUIComponents() {

    }
}

package view;

import helper.Config;
import helper.DBConnector;
import helper.Helper;
import model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class SignInGUI extends JFrame {
    private JTextField fld_e_mail;
    private JTextField fld_uname;
    private JTextField fld_firstname;
    private JTextField fld_surname;
    private JTextField fld_pass;
    private JTextField fld_pass_again;
    private JPanel wrapper;
    private JButton btn_signin;

    public SignInGUI() {
        wrapper = new JPanel();

        add(wrapper);
        setSize(600, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        fld_e_mail = new JTextField(20);
        fld_uname = new JTextField(20);
        fld_firstname = new JTextField(20);
        fld_surname = new JTextField(20);
        fld_pass = new JTextField(20);
        fld_pass_again = new JTextField(20);
        btn_signin = new JButton("Sign In");

        wrapper.add(new JLabel("E-mail: "));
        wrapper.add(fld_e_mail);
        wrapper.add(new JLabel("Username: "));
        wrapper.add(fld_uname);
        wrapper.add(new JLabel("First Name: "));
        wrapper.add(fld_firstname);
        wrapper.add(new JLabel("Surname: "));
        wrapper.add(fld_surname);
        wrapper.add(new JLabel("Password: "));
        wrapper.add(fld_pass);
        wrapper.add(new JLabel("Password Again: "));
        wrapper.add(fld_pass_again);
        wrapper.add(btn_signin);

        btn_signin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = fld_e_mail.getText();
                String username = fld_uname.getText();
                String firstName = fld_firstname.getText();
                String surname = fld_surname.getText();
                String password = fld_pass.getText();
                String passwordAgain = fld_pass_again.getText();

                if (Helper.isFieldEmpty(fld_e_mail) || Helper.isFieldEmpty(fld_uname)
                        || Helper.isFieldEmpty(fld_firstname) || Helper.isFieldEmpty(fld_surname)
                        || Helper.isFieldEmpty(fld_pass) || Helper.isFieldEmpty(fld_pass_again)) {
                    Helper.showMsg("fill");
                    return;
                }

                if (!isEmailValid(email)) {
                    return;
                }

                if (!isPasswordsMatch(password, passwordAgain)) {
                    return;
                }

                if (addNewStudent(firstName + " " + surname, username, password)) {
                    Helper.showMsg("Kayıt başarıyla oluşturuldu. Giriş yapabilirsiniz.");
                    dispose();
                    new LoginGUI(); // Yeni bir giriş ekranı oluşturarak kayıt ekranını kapatalım.
                }
            }
        });
    }

    private boolean isEmailValid(String mail) {
        // E-posta geçerlilik kontrolü burada yapılacak
        if (mail.contains("@gmail.com") || mail.contains("@hotmail.com") || mail.contains("@icloud.com")
                || mail.contains("@yahoo.com") || mail.contains("@yandex.com") || mail.contains("@outlook.com")) {
            return true;
        } else {
            Helper.showMsg("Lütfen geçerli bir e-posta girin.");
            return false;
        }
    }

    private boolean isPasswordsMatch(String pass, String pass_again) {
        // Şifre eşleşme kontrolü burada yapılacak
        if (!pass.equals(pass_again)) {
            Helper.showMsg("Şifreler aynı değil.");
            return false;
        }
        return true;
    }

    private boolean addNewStudent(String name, String username, String password) {
        String query = "INSERT INTO public.user (name, uname, pass, type) VALUES (?, ?, ?, ?)";
        User findUser = User.getFetch(username);
        if (findUser != null) {
            Helper.showMsg("Bu kullanıcı adı zaten alınmış. Lütfen farklı bir kullanıcı adı seçin.");
            return false;
        }

        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1, name);
            pr.setString(2, username);
            pr.setString(3, password);
            pr.setObject(4, "student", Types.OTHER);

            int result = pr.executeUpdate();
            return result != -1;
        } catch (SQLException e) {
            Helper.showMsg("Kayıt eklenirken bir hata oluştu: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }


}

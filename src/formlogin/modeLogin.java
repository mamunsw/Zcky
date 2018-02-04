/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlogin;

import javax.swing.JOptionPane;

/**
 *
 * @author MSW98
 */
public class modeLogin {

    private String userName;
    private String password;
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Login(String userName, String password) {

        if (userName.equals("msw") && password.equals("123")) {
            JOptionPane.showMessageDialog(null, "Berhasil");
        }
        else {
        userName = "";
        password = "";
        JOptionPane.showMessageDialog(null, "salah");
    }

}
}

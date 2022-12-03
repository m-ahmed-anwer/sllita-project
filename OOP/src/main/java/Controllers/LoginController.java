package Controllers;

import Models.Login;
import java.util.ArrayList;

public class LoginController {

    ArrayList<Login> userDB;
    public LoginController() {
        userDB = new ArrayList<>();
        loadLoginInfo();
    }
    final void loadLoginInfo() {
        userDB.add(new Login("admin", "123"));
        userDB.add(new Login("admin", "456"));
        userDB.add(new Login("admin", "admin"));
    }
    int leng = userDB.size();

    public int getLeng() {
        return leng;
    }
    
    public Login checkUser(String user)
    {
        for(Login u:userDB)
        {
           if(u.getClass().equals(user))
           {
              return u;               
           }
        }        
        return null;        
    }    
}

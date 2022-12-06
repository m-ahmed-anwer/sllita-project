package Controllers;

import Models.User;
import java.util.ArrayList;

public class LoginController {

    ArrayList<User> userDB;
    public LoginController() {
        userDB = new ArrayList<>();
        loadLoginInfo();
    }
    final void loadLoginInfo() {
        userDB.add(new User("customer", "123"));
        userDB.add(new User("employee", "123"));
        userDB.add(new User("admin", "123"));
    }
    public User checkUser(String user)
    {
        for(User u:userDB)
        {
           if(u.getUserName().equals(user))
           {
              return u;               
           }
        }        
        return null;        
    }    
}

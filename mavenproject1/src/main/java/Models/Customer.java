
package Models;

import static Models.Order.orderId;

/**
 *
 * @author ahmed
 */
public class Customer {
    public static int id;
    private String name;
    private String email;
    private int phoneNum;
    
    //Constructor
    public Customer(String name, String email, int phoneNum) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        id++;
    }
    
    // @overloading
    public Customer(){
        this.name = "";
        this.email = "";
        this.phoneNum = 0;
    }

    public static int calcID() {
        return id;
    }

    public String getName() { //Getter
        return name;
    }

    public String getEmail() { //Getter
        return email;
    }

    public int getPhoneNum() { //Getter
        return phoneNum;
    }

    
    public void setName(String name) { //Setter
        this.name = name;
    }

    public void setEmail(String email) { //Setter
        this.email = email;
    }

    public void setPhoneNum(int phoneNum) { //Setter
        this.phoneNum = phoneNum;
    }
    
    // @overloaded
    public String printDetail(){
        return("Customer Id : "+id+"\nName : "+name+
               "\nEmail : "+email+"\nPhone Number : "+phoneNum);
    }
    
    
}
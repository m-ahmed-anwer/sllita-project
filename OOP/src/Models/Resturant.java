/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Models.Customer.id;

/**
 *
 * @author ahmed
 */
public class Resturant {
    private String name;
    private int seatNum;
    private int tableNo;

    public Resturant(String name, int seatNum, int tableNo) {
        this.name = name;
        this.seatNum = seatNum;
        this.tableNo = tableNo;
    }

    public String getName() { //Getter
        return name;
    }

    public int getSeatNum() { //Getter
        return seatNum;
    }

    public int getTableNo() { //Getter
        return tableNo;
    }

    public void setName(String name) { //Setter
        this.name = name;
    }

    public void setSeatNum(int seatNum) { //Setter
        this.seatNum = seatNum;
    }

    public void setTableNo(int tableNo) { //Setter
        this.tableNo = tableNo;
    }
    
    // @overloaded
    String printDetail(){
        return("Name : "+name+"\nSeat Number : "+seatNum+"\nTable Number : "+tableNo);
    }
    
    
    
}


package Models;


public class Order {
    static int orderId;
    private String food;
    private int  foodQuantity;
    private String beverage;

    public Order(String  food, int foodQuantity, String beverage) {
        this.food = food;
        this.foodQuantity = foodQuantity;
        this.beverage = beverage;
        orderId++;
    }

    static int calcOrderId() {
        return orderId;
    }

    public String getFood() { //Getter
        return food;
    }

    public int getFoodQuantity() { //Getter
        return foodQuantity;
    }

    public String getBeverage() { //Getter
        return beverage;
    }
    
    // @overloaded
    public String printDetail(){
        return("Order Id : "+orderId+"\nFood : "+food+
               "\nQuantity : "+foodQuantity+"\nBeverage : "+beverage);
    }
    
    
    
}

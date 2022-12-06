package ModelsTest;

import org.junit.jupiter.api.*;
import Models.Order;


public class OrderTest {
    
    static Order o1;
    
    
    @BeforeAll
    public static void CreateOrder()
    {
        o1=new Order("Pizza",2,"Sprite");
    }
    @Test
    public void CheckOrder()
    {
        Assertions.assertNotNull(o1.getFood());
        Assertions.assertNotNull(o1.getFoodQuantity());
        Assertions.assertNotNull(o1.getBeverage());
    }
    @AfterAll
    public static void DeleteOrder()
    {
        o1=null;
    }
}

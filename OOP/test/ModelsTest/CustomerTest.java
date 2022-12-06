
package ModelsTest;


import Models.Customer;
import org.junit.jupiter.api.*;

public class CustomerTest {
    static Customer c1;
  
    
    @BeforeAll
    public static void CreateCustomer()
    {
        c1=new Customer("kamal","kamal12@gmail.com",0711231232);
    }
    @Test
    public void CheckCustomer()
    {
        Assertions.assertNotNull(c1.getName());
        Assertions.assertNotNull(c1.getEmail());
        Assertions.assertNotNull(c1.getPhoneNum());
    }
    @AfterAll
    public static void DeleteCustomer()
    {
        c1=null;
    }
}
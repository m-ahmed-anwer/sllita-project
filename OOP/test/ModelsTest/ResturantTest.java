package ModelsTest;

import Models.Resturant;
import org.junit.jupiter.api.*;

public class ResturantTest {
    static Resturant r1;
  
    
    @BeforeAll
    public static void CreateResturant()
    {
        r1=new Resturant("ueats",10,4);
    }
    @Test
    public void CheckResturant()
    {
        Assertions.assertNotNull(r1.getName());
        Assertions.assertNotNull(r1.getSeatNum());
        Assertions.assertNotNull(r1.getTableNo());
    }
    @AfterAll
    public static void DeleteResturant()
    {
        r1=null;
    }
}

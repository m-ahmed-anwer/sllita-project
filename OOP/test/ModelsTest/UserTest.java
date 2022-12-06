package ModelsTest;

import Models.User;
import org.junit.jupiter.api.*;


public class UserTest {
    
    static User u1;
    
    @BeforeAll
    public static void CreateUser()
    {
        u1=new User("admin","123");
    }
    @Test
    public void CheckUser()
    {
        Assertions.assertNotNull(u1.getUserName());
        Assertions.assertNotNull(u1.getPassword());
    }
    @AfterAll
    public static void DeleteUser()
    {
        u1=null;
    }
    
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest{

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Pat Smith", "NZ 99 24 35 D", 34_000, "Accounts");
    }

    @Test
    public void hasName(){
        assertEquals("Pat Smith", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NZ 99 24 35 D", manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(34_000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounts", manager.getDeptName());
    }

}

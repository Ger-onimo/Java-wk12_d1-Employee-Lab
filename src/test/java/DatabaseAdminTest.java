import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Polly Edwards", "DD 34 56 78 C", 27_000);
    }

    @Test
    public void hasName(){
        assertEquals("Polly Edwards", databaseAdmin.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("DD 34 56 78 C", databaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(27_000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(20);
        assertEquals(27_020, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(270, databaseAdmin.payBonus(), 0.01);
    }

}

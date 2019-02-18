import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Shaun Shears", "GH 76 88 99 M",
                65_000, "Android Sheep Dev", 100_000);
    }

    @Test
    public void hasName(){
        assertEquals("Shaun Shears", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GH 76 88 99 M", director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(65_000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Android Sheep Dev", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1_000);
        assertEquals(66_000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(650, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(100_000, director.getBudget(),0.01);
    }


}

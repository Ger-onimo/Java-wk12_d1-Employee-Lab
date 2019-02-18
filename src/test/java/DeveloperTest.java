import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer;

        @Before
        public void before(){
            developer = new Developer("Joe King", "AB 12 34 56 Z", 27_000);
        }

        @Test
        public void hasName(){
            assertEquals("Joe King", developer.getName());
        }

        @Test
        public void hasNIN(){
            assertEquals("AB 12 34 56 Z", developer.getNI());
        }

        @Test
        public void hasSalary(){
            assertEquals(27_000, developer.getSalary(), 0.01);
        }

        @Test
        public void canRaiseSalary(){
            developer.raiseSalary(20);
            assertEquals(27_020, developer.getSalary(), 0.01);
        }

        @Test
        public void canPayBonus(){
            assertEquals(270, developer.payBonus(), 0.01);
        }

}

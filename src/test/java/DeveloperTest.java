import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("Brian Appboy", "2", 3000);
    }

    @Test
    public void hasName(){
        assertEquals("Brian Appboy", developer1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("2", developer1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(3000, developer1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(1000.5);
        assertEquals(4000.50, developer1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer1.raiseSalary(1000);
        developer1.raiseSalary(developer1.payBonus());
        assertEquals(4040, developer1.getSalary(), 0.01);
    }


}

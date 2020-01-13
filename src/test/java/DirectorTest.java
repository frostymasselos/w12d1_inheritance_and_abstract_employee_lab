import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director1;

    @Before
    public void before() {
        director1 = new Director("ChiChi", "3", 1000000000, "Manager's Management Department", 10000);
    }

    @Test
    public void hasName(){
        assertEquals("ChiChi", director1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("3", director1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000000000, director1.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Manager's Management Department", director1.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000, director1.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(1000.5);
        assertEquals(1000001000.50, director1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        director1.raiseSalary(director1.payBonus());
        assertEquals(1010000000, director1.getSalary(), 0.01);
    }
}

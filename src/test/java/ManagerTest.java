import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager1;

    @Before
    public void before() {
        manager1 = new Manager("Ryan MrManager", "1", 100, "human resources");
    }

    @Test
    public void hasName(){
        assertEquals("Ryan MrManager", manager1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("1", manager1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(100, manager1.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("human resources", manager1.getDeptName());
    }

    @Test
    public void canRaiseSalary__PositiveNumberInputted(){
        manager1.raiseSalary(10.50);
        assertEquals(110.5, manager1.getSalary(), 0.01);
    }

    public void canRaiseSalary__NegativeNumberInputted(){
        manager1.raiseSalary(-20.50);
        assertEquals(120.5, manager1.getSalary());
    }

    @Test
    public void canPayBonus(){
        double bonus = manager1.payBonus();
        manager1.raiseSalary(bonus);
        assertEquals(101.00, manager1.getSalary(), 0.01);
    }
}

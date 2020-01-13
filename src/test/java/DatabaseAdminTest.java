import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin dbadmin1;

    @Before
    public void before(){
        dbadmin1 = new DatabaseAdmin("Rodger 'Scumbag' Rodgerson", "BX772XTu3", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Rodger 'Scumbag' Rodgerson", dbadmin1.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("BX772XTu3", dbadmin1.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(5, dbadmin1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dbadmin1.raiseSalary(0.5);
        assertEquals(5.5, dbadmin1.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        double bonus = dbadmin1.payBonus();
        dbadmin1.raiseSalary(bonus);
        assertEquals(5.05, dbadmin1.getSalary(), 0.01);
    }
}

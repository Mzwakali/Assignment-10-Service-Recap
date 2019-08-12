package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.EmployeeRace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    private EmployeeRace empRace;

    @Before
    public void setUp() throws Exception {
        empRace = EmployeeRaceFactory.buildEmployeeRace(1,4);
    }

    @Test
    public void buildEmployeeRace() {
        assertNotNull(empRace);
    }
}
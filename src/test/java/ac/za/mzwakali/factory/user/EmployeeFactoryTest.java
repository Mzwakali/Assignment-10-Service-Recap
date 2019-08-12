package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.buildEmployee(1,"Thando","Mzwakali");
    }

    @Test
    public void buildEmployee() {
        assertEquals(employee.getLastName(),"Mzwakali");
    }
}
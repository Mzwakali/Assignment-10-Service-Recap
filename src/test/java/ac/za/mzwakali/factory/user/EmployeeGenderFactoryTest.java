package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(1,2);
    }

    @Test
    public void buildEmployeeGender() {
        Assert.assertNotNull(employeeGender);
    }}
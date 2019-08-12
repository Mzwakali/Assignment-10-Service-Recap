package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {

    private EmployeeGenderServiceImpl employeeGenderService;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(1,2);
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> employeeGenders = employeeGenderService.getAll();
        Assert.assertNotNull(employeeGenders);
    }

    @Test
    public void create() {
        assertEquals(employeeGenderService.create(employeeGender),employeeGenderService.create(employeeGender));
    }

    @Test
    public void read() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNotNull(gender);
    }

    @Test
    public void update() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        employeeGender.setEmpNum(1);
        employeeGenderService.update(employeeGender);
        Assert.assertEquals(employeeGender.getEmpNum(),gender.getEmpNum());
    }

    @Test
    public void delete() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNotNull(gender);
        employeeGenderService.delete(employeeGender.getEmpNum());
        EmployeeGender genderDeleted = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNull(genderDeleted);
    }
}
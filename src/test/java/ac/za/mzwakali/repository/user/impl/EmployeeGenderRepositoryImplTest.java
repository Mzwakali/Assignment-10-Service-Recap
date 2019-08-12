package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.factory.user.EmployeeGenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    EmployeeGenderRepositoryImpl repository;
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender(1,2);
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employeeGender));
    }

    @Test
    public void read() {
        assertNull(repository.read(employeeGender.getEmpNum()));
    }

    @Test
    public void update() {
        assertNotNull(repository.update(employeeGender));
    }

    @Test
    public void delete() {
        repository.delete(employeeGender.getEmpNum());
    }
}
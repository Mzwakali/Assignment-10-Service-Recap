package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.factory.user.EmployeeFactory;
import ac.za.mzwakali.repository.user.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    private EmployeeRepositoryImpl employeeRepository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
        employee = EmployeeFactory.buildEmployee(1,"Thando","Mzwakali");
    }

    @Test
    public void create() {
        assertNotNull(employeeRepository.create(employee));
    }

    @Test
    public void read() {
        assertNull(employeeRepository.read(employee.getEmpNum()));
    }

    @Test
    public void update() {
        assertNotNull(employeeRepository.update(employee));
    }

    @Test
    public void delete() {
        employeeRepository.delete(employee.getEmpNum());
    }
}
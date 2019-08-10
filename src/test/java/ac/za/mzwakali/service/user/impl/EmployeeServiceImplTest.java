package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.factory.user.EmployeeFactory;
import ac.za.mzwakali.service.user.EmployeeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeService;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.employeeService = EmployeeServiceImpl.getEmployeeService();
        employee = EmployeeFactory.buildEmployee(1,"Thando","Mzwakali");
    }

    @Test
    public void getAll() {
        Set<Employee> employees = employeeService.getAll();
        Assert.assertNotNull(employees);
    }

    @Test
    public void create() {
        employeeService.create(employee);
        Assert.assertNotNull(employeeService.read(1));
        System.out.println("Created:\n" +employeeService.read(1));
    }

    @Test
    public void read() {
        assertNotNull(employeeService.read(1));
        System.out.println("Read:\n" +employeeService.read(1));
    }

    @Test
    public void update() {
        employeeService.create(employee);
        System.out.println(employeeService.read(1));

        Employee employeeUpdate = EmployeeFactory.buildEmployee(2,"Senzo","Meyiwa");

    }

    @Test
    public void delete() {
    }
}
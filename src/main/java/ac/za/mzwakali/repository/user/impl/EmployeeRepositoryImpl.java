package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.repository.user.EmployeeRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl employeeRepository = null;
    private Map<Integer, Employee> employees;

    private EmployeeRepositoryImpl(){
        employees = new HashMap<>();
    }

    public static EmployeeRepositoryImpl getEmployeeRepository(){
        if (employeeRepository == null){
            return new EmployeeRepositoryImpl();
        }
        return employeeRepository;
    }

    @Override
    public Set<Employee> getAll() {
        return new HashSet<>(employees.values());
    }

    @Override
    public Employee create(Employee employee) {
        if (read(employee.getEmpNum()) == null){
            employees.put(employee.getEmpNum(), employee);
        }
        return employee;
    }

    @Override
    public Employee read(Integer id) {
        return this.employees.get(id);
    }

    @Override
    public Employee update(Employee employee) {
        Employee empUpdate = read(employee.getEmpNum());
        if (empUpdate != null){
            employees.replace(employee.getEmpNum(), employee);
}
        return employee;
    }

    @Override
    public void delete(Integer id) {
        Employee empDelete = read(id);
        if (empDelete != null){
            employees.remove(id, empDelete);
        }

    }
}

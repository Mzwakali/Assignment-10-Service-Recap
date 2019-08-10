package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.repository.user.EmployeeRepository;
import ac.za.mzwakali.repository.user.impl.EmployeeRepositoryImpl;
import ac.za.mzwakali.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl employeeService = null;
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(){
        employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getEmployeeService() {
        if (employeeService == null){
            return new EmployeeServiceImpl();
        }
        return employeeService;
    }

    @Override
    public Set<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.create(employee);
    }

    @Override
    public Employee read(Integer id) {
        return employeeRepository.read(id);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeRepository.delete(id);

    }
}

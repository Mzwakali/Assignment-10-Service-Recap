package ac.za.mzwakali.service.user;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, Integer> {

    Set<Employee>getAll();
}

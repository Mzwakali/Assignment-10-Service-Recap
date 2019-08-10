package ac.za.mzwakali.repository.user;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, Integer>

    {
        Set<Employee> getAll();
    }


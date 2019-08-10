package ac.za.mzwakali.repository.user;

import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, Integer> {
    Set<EmployeeGender> getAll();
}

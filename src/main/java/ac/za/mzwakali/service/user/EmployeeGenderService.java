package ac.za.mzwakali.service.user;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, Integer> {

    Set<EmployeeGender>getAll();
}

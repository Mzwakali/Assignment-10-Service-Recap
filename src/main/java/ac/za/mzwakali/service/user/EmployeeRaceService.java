package ac.za.mzwakali.service.user;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, Integer> {

    Set<EmployeeRace>getAll();
}

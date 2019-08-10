package ac.za.mzwakali.repository.user;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, Integer> {

    Set<EmployeeRace>getAll();
}

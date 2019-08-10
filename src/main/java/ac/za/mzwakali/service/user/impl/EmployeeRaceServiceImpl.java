package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.repository.user.EmployeeRaceRepository;
import ac.za.mzwakali.repository.user.impl.EmployeeRaceRepositoryImpl;
import ac.za.mzwakali.service.user.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private static EmployeeRaceServiceImpl employeeRaceService = null;
    private EmployeeRaceRepository raceRepository;

    public EmployeeRaceServiceImpl(){
        raceRepository = EmployeeRaceRepositoryImpl.getEmployeeRaceRepository();
    }

    public static EmployeeRaceServiceImpl getEmployeeRaceService() {
        if (employeeRaceService == null){
            return new EmployeeRaceServiceImpl();
        }
        return employeeRaceService;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return raceRepository.getAll();
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return raceRepository.create(employeeRace);
    }

    @Override
    public EmployeeRace read(Integer id) {
        return raceRepository.read(id);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return raceRepository.update(employeeRace);
    }

    @Override
    public void delete(Integer id) {
        raceRepository.delete(id);

    }
}

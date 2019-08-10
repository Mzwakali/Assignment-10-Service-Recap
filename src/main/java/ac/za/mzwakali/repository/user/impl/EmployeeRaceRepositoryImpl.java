package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.EmployeeRace;
import ac.za.mzwakali.repository.user.EmployeeRaceRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {

    private static EmployeeRaceRepositoryImpl employeeRaceRepository = null;
    private Map<Integer,EmployeeRace> employeeRaces;

    private EmployeeRaceRepositoryImpl(){
        employeeRaces = new HashMap<>();
    }

    public static EmployeeRaceRepositoryImpl getEmployeeRaceRepository() {
        if (employeeRaceRepository == null){
            return new EmployeeRaceRepositoryImpl();
        }
        return employeeRaceRepository;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return new HashSet<>(employeeRaces.values());
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaces.put(employeeRace.getEmpNum(),employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace read(Integer id) {
        return employeeRaces.get(id);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        employeeRaces.replace(employeeRace.getEmpNum(),employeeRace);
        return employeeRaces.get(employeeRace.getEmpNum());
    }

    @Override
    public void delete(Integer id) {
        employeeRaces.remove(id);

    }
}

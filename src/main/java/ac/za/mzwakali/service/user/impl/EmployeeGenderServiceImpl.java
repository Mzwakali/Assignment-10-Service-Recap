package ac.za.mzwakali.service.user.impl;

import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.repository.user.EmployeeGenderRepository;
import ac.za.mzwakali.repository.user.impl.EmployeeGenderRepositoryImpl;
import ac.za.mzwakali.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl employeeGenderService = null;
    private EmployeeGenderRepository employeeGenderRepository;

    public EmployeeGenderServiceImpl(){
        employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    public static EmployeeGenderServiceImpl getEmployeeGenderService() {
        if (employeeGenderService == null){
            return new EmployeeGenderServiceImpl();
        }
        return employeeGenderService;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenderRepository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(Integer id) {
        return employeeGenderRepository.read(id);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return employeeGenderRepository.update(employeeGender);
    }

    @Override
    public void delete(Integer id) {
        employeeGenderRepository.delete(id);

    }
}

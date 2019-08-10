package ac.za.mzwakali.repository.user.impl;

import ac.za.mzwakali.domain.user.EmployeeGender;
import ac.za.mzwakali.repository.user.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

   private static EmployeeGenderRepositoryImpl employeeGenderRepository = null;
   private Map<Integer, EmployeeGender> employeeGenders;

   private EmployeeGenderRepositoryImpl(){
       employeeGenders = new HashMap<>();
   }

    public static EmployeeGenderRepositoryImpl getEmployeeGenderRepository() {
       if (employeeGenderRepository == null){
           return new EmployeeGenderRepositoryImpl();
       }
       return employeeGenderRepository;
    }

   @Override
    public Set<EmployeeGender> getAll() {
        return new HashSet<>(employeeGenders.values());
    }

   @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
       employeeGenders.put(employeeGender.getEmpNum(), employeeGender);
       return employeeGender;
    }

   @Override
    public EmployeeGender read(Integer id) {
        return employeeGenders.get(id);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
       EmployeeGender empGenderUpdate = read(employeeGender.getEmpNum());
       if (empGenderUpdate != null){
           employeeGenders.replace(employeeGender.getEmpNum(), employeeGender);

       }

       return employeeGender;
    }

    @Override
    public void delete(Integer id) {
       EmployeeGender empGenderDelete = read(id);
       if (empGenderDelete != null) {
           employeeGenders.remove(id,empGenderDelete);
       }


    }
}

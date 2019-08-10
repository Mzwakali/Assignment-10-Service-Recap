package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(int empNum, int genderId){
        return new EmployeeGender().employeeGender(empNum,genderId);
    }
}

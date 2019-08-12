package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.domain.user.Employee;
import ac.za.mzwakali.domain.user.EmployeeGender;

public class EmployeeFactory {

    public static Employee buildEmployee(int empNum, String firstName, String lastName){
       // EmployeeGender genderBuild = EmployeeGenderFactory.buildEmployeeGender(empNum,genderId)
        return new Employee.Builder()
                .empNum(empNum)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}

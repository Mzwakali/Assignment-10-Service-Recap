package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.Employee;

public class EmployeeFactory {

    public static Employee buildEmployee(int empNum, String firstName, String lastName){
        return new Employee.Builder()
                .empNum(empNum)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}

package ac.za.mzwakali.factory.user;

import ac.za.mzwakali.domain.user.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace buildEmployeeRace(int empNum, int raceId){
        return new EmployeeRace().employeeRace(empNum,raceId);
    }
}

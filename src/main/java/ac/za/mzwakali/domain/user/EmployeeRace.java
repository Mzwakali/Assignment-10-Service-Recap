package ac.za.mzwakali.domain.user;

public class EmployeeRace {

    private int empNum;
    private int raceId;

    public EmployeeRace() {
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public EmployeeRace employeeRace(int empNum, int raceId){
        this.empNum = empNum;
        this.raceId = raceId;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "empNum=" + empNum +
                ", raceId=" + raceId +
                '}';
    }
}

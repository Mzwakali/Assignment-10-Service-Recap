package ac.za.mzwakali.domain.user;

public class EmployeeGender {

    private int genderId;
    private int empNum;

    public EmployeeGender() {
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "genderId=" + genderId +
                ", empNum=" + empNum +
                '}';
    }

    public EmployeeGender employeeGender(int empNum, int genderId){
        this.empNum = empNum;
        this.genderId = genderId;
        return this;
    }
}

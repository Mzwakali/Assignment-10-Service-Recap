package ac.za.mzwakali.domain.user;

import ac.za.mzwakali.domain.demography.Gender;
import ac.za.mzwakali.domain.demography.Race;

import java.util.Objects;

public class Employee {

    private int empNum;
    private String firstName;
    private String lastName;
    /*private Gender gender;
    private Race race;*/

    public Employee() {
    }

    public Employee(Builder builder) {
        this.empNum = builder.empNum;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum=" + empNum +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private int empNum;
        private String firstName;
        private String lastName;

        public Builder empNum(int empNum){
            this.empNum = empNum;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        public Employee copy(Employee employee){
            this.empNum = employee.empNum;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;

            return employee;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return empNum == builder.empNum &&
                    firstName.equals(builder.firstName) &&
                    lastName.equals(builder.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(empNum, firstName, lastName);
        }
    }
}

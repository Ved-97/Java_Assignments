package employee;

import Gender;
import customException.InValidNameException;
import customException.InValidSalaryException;
import vehicle.Vehicle;

import javax.xml.bind.ValidationException;

public abstract class Faculty extends Employee{

    String department;

    public Faculty(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary, String department) throws InValidSalaryException, InValidNameException {
        super(id, firstname, lastname, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


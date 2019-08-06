package domain.model.employee;

import domain.model.employee.Employee;

import java.io.Serializable;
import java.util.Date;

public class Admin extends Employee implements Serializable {

	public Admin(int employeeId ,String firstName, String lastName, String email, String password) {
		super(employeeId, firstName, lastName, email,  password);
	}

	@Override
	public String toString() {
		return "[FirstName is : " + getFirstName() + ", LastName is : " + getLastName() +  ", mobileNumber is : "  + ", Email is : "
				 + ", Password is: "  + getPassword() + "]";
	}
}

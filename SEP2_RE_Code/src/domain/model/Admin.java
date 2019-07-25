package domain.model;

import java.io.Serializable;
import java.util.Date;

public class Admin extends Employee implements Serializable {

	public Admin(int cprNumber, String firstname, String lastname,  String mobileNumber, String email,
			 String employeepassword) {
		super(cprNumber, firstname, lastname, mobileNumber, email,  employeepassword);
	}

	@Override
	public String toString() {
		return "[FirstName is : " + getFirstName() + ", LastName is : " + getLastName() +  ", mobileNumber is : " + getmobileNumber() + ", Email is : "
				+ getEamil() + ", Password is: "  + getPassword() + "]";
	}
}

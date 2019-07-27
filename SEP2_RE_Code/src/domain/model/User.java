package domain.model;

import java.io.Serializable;

public class User extends Employee implements Serializable {

    public User(int cprNumber, String firstName, String lastName, String mobileNumber, String email, String employeePassword) {
        super(cprNumber, firstName, lastName, mobileNumber, email, employeePassword);
    }

    @Override
    public String toString() {
        return "[FirstName is : " + getFirstName() + ", LastName is : " + getLastName() +  ", mobileNumber is : " + getmobileNumber() + ", Email is : "
                + getEamil() + ", Password is: "  + getPassword() + "]";
    }

}

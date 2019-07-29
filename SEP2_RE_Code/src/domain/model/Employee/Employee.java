package domain.model;
import java.io.Serializable;
import java.util.Date;
	

	abstract public class Employee implements Serializable {

		private int cprNumber;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String email;
		private String password;

		public Employee(int cprNumber, String firstName, String lastName,  String mobileNumber, String email,
			 String password) {

			this.cprNumber = cprNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobileNumber = mobileNumber;
			this.email = email;
			this.password = password;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setCprNumber(int cpr) {
			this.cprNumber = cpr;
		}

		public void setmobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public void setEamil(String email) {
			this.email = email;
		}

	

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getcprNumber() {
			return cprNumber;
		}


		public String getmobileNumber() {
			return mobileNumber;
		}

		public String getEamil() {
			return email;
		}


		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String toString() {
			return "firstName is :" + firstName + ", lastName is: " + lastName  + ", mobileNumber is : " + mobileNumber + ", eamil is : " + email ;
		}

	}



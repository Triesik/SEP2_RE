package domain.model.employee;

public class Employee implements java.io.Serializable {

	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private int employeeId;
	private String password;
	private String userType;

	public Employee(int employeeId, String firstName, String lastName, String email, String password, String userType)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.employeeId = employeeId;
		this.userType = userType;
	}

	public Employee()
	{

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEamil(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}

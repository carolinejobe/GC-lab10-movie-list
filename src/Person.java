
public class Person {

	private String firstName, lastName, SSN;

	public Person() {
		this("","");
	}
	
	public Person(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public String getFullName() {
		return lastName + ", " + firstName;
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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
}

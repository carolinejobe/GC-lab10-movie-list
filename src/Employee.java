
public class Employee extends Person {

	public String title;
	
	public float salary;
	
	public String companyName;
	
	String phone;
	
	public Employee (String fName, String lName, String t) {
		//setFirstName(fName);
		//setLastName(lName);
		super(fName, lName);  //call a constructor from super class ("this" calls constructor from same class)
		title = t;
	}
	
	@Override
	public String getFullName() {
		return title + " " + getFirstName() + " " + getLastName(); 
	}
	
}

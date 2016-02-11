
public class MainApp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setFirstName("Caroline");
		p1.setLastName("Jobe");
		
		Employee e1 = new Employee("", "", "");
		
		e1.setFirstName("John");
		e1.setLastName("Smith");
		

	//	System.out.println(p1.getFullName());
	//	System.out.println(e1.getFullName());

		@SuppressWarnings("unused")
		Person p2 = new Employee("", "", "");  
		
		Person[] humans = new Person[2];
		humans[0] = p1;
		humans[1] = e1;
		
		for (int i=0; i<humans.length; i++)
			System.out.println(humans[i].getFullName());
		
	}

}

class Employee {
	//initializing instance variable

	String firstName;
	String lastName;
	double monthlySalary;

	//declaring constructor

	public void Employee() {
		firstName = "James";
		lastName = "Bond";
		monthlySalary = 3456.78;
	}
	
	//get methods for each instance variable

	public String getFirstName(String firstName) {
		return firstName;
	}

	public String getLastName(String lastName) {
		return lastName;
	}

	public double getMonthlySalary(double monthlySalary) {
		return monthlySalary;
	}
	
}

class TwentyFour {
	public static void main(String args[]){
		Employee obj = new Employee();
		
		//calling constructor
		obj.Employee();
		String f = "Nobita";
		String l = "Chan";
		double s = 3456.78;
		
		//calling get methods
		System.out.println(obj.getFirstName(f));
		System.out.println(obj.getLastName(l));
		System.out.println(obj.getMonthlySalary(s));				
	}
}
class Employee {
	//initializing instance variable

	String firstName = "James";
	String lastName = "Bond";
	double monthlySalary = 3456.78;

	public void EmployeeDetails() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(monthlySalary);
	}
}

class TwentyThree {
	public static void main(String args[]){
		Employee obj = new Employee();
		System.out.println("Calling instance variable of class Employee: ");
		obj.EmployeeDetails();		
	}
}
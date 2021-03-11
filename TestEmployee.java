import java.util.*;

class Employee {
	int id;
	String name;
	float salary;
	void insert(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	} 
	void display() {
		System.out.println("name: " + name + " salaray: " + salary + " id: " + id);
	}
}

class TestEmployee {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insert(101,"Suzan",50000);
		e2.insert(102,"Jack",70000);
		e3.insert(103,"John",68000);
		e1.display();
		e2.display();
		e3.display();
	}
}
import java.util.*;

abstract class Employee {
	abstract long getAmount();
} 

class WeeklyEmployee extends Employee {
	int weeks;
	void setData(int weeks) {
		this.weeks = weeks;
	}
	long getAmount() {
		return (7000*weeks);
	}
}

class HourlyEmployee extends Employee {
	int hours;
	void setData(int hours) {
		this.hours = hours;
	}
	long getAmount() {
		return (50*hours);
	}
}

class AbstractEmployeeMain {
	public static void main(String args[]) {
		WeeklyEmployee ob = new WeeklyEmployee();
		ob.setData(10);	
		long amount = ob.getAmount();
		System.out.println("The amount earned-weekly is: " + amount);
		HourlyEmployee ob1 = new HourlyEmployee();
		ob1.setData(135);
		amount = ob1.getAmount();
		System.out.println("The amount earned-hourly is: " + amount);
	}
}
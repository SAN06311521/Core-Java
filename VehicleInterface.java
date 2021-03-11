import java.util.*;

interface Vehicle {
	String getColor();
	int getNumber();
	double getComposition();
}

class TwoWheeler implements Vehicle {
	String name;
	String color;
	int number;
	double fuel;
	void setData(String name, String color, int number, double fuel) {
		this.name = name;
		this.color = color;
		this.number = number;
		this.fuel = fuel;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNumber() {
		return number;
	}
	public double getComposition() {
		return fuel;
	}
}

class FourWheeler implements Vehicle {
	String name;
	String color;
	int number;
	double fuel;
	void setData(String name, String color, int number, double fuel) {
		this.name = name;
		this.color = color;
		this.number = number;
		this.fuel = fuel;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNumber() {
		return number;
	}
	public double getComposition() {
		return fuel;
	}
}

class VehicleInterface {
	public static void main(String args[]) {
		TwoWheeler t = new TwoWheeler();
		t.setData("KTM", "White", 2202, 500.12);
		String name = t.getName();
		String color = t.getColor();
		int number = t.getNumber();
		double fuel = t.getComposition();
		System.out.println("Name: " + name + " " + "Color: " + color + " " + "Number: " + number + " " + "Fuel consumption: " + fuel );
		FourWheeler t1 = new FourWheeler();
		t1.setData("Audi", "White", 2202, 500.12);
		String name1 = t1.getName();
		String color1 = t1.getColor();
		int number1 = t1.getNumber();
		double fuel1 = t1.getComposition();
		System.out.println("Name: " + name1 + " " + "Color: " + color1 + " " + "Number: " + number1 + " " + "Fuel consumption: " + fuel1 );
	}
}
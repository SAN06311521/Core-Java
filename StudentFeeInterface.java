import java.util.*;

interface StudentFee {
	String getAmount();
	String getFirstName();
	String getLastName();
	String getAddress();
	String getContact();
}

class Hostler implements StudentFee {
	String fname;
	String lname;
	String address;
	String contact;
	String amount;
	void setData(String fname, String lname, String address, String contact, String amount) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.contact = contact;
		this.amount = amount;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public String getFirstName() {
		return fname;	
	}

	public String getLastName() {
		return lname;
	}

	public 	String getAddress() {
		return address;
	}
	
	public String getContact() {
		return contact;
	}
}

class NonHostler implements StudentFee {
	String fname;
	String lname;
	String address;
	String contact;
	String amount;
	void setData(String fname, String lname, String address, String contact, String amount) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.contact = contact;
		this.amount = amount;
	}
	
	public String getAmount() {
		return amount;
	}
	
	public String getFirstName() {
		return fname;	
	}

	public String getLastName() {
		return lname;
	}

	public String getAddress() {
		return address;
	}
	
	public String getContact() {
		return contact;
	}
}

class StudentFeeInterface {
	public static void main(String args[]) {
		Hostler h = new Hostler();
		h.setData("John", "Doe", "New York", "8989898989", "5000");
		String a = h.getAmount();
		String fn = h.getFirstName();
		String ln = h.getLastName();
		String add = h.getAddress();
		String c = h.getContact();
		System.out.println("First name: " + fn + " Last Name: " + ln + " Address: " + add + " Amount: " + a + " Contact: " + c);
		NonHostler h1 = new NonHostler();
		h1.setData("Jack", "Williams", "Denmark", "8999898989", "4000");
		String am = h1.getAmount();
		String fnm = h1.getFirstName();
		String lnm = h1.getLastName();
		String addr = h1.getAddress();
		String con = h1.getContact();
		System.out.println("First name: " + fnm + " Last Name: " + lnm + " Address: " + addr + " Amount: " + am + " Contact: " + con);
	}
}
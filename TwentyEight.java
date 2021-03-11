class Account {
	
	//instance variable
	double balance;
	double finalAmount;
	
	//constructor
	public Account(double balance) {
		if(balance > 0) {
			this.balance = balance;
			System.out.println("Balance is greater than zero!");
		}else {
			System.out.println("Enter valid balance i.e. greater than zero!");
		}
	}
	
	//credit method-
	void credit(double a) {
		finalAmount = a + balance;
		System.out.println("Amount is added to main balance!");
	}

	//getBalance method
	public double getBalance() {
		return finalAmount;
	}
}

class TwentyEight {
	public static void main(String args[]) {
		Account obj = new Account(65.5);
		obj.credit(10.0);
		System.out.println("Final main balance after addition is: " + obj.getBalance());
	}
}
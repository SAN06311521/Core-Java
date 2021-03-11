class Account {
	
	//instance variable
	double balance;
	
	//constructor
	public Account(double balance) {
		if(balance > 0) {
			this.balance = balance;
			System.out.println("Balance is greater than zero!");
		}else {
			System.out.println("Enter valid balance i.e. greater than zero!");
		}
	}
}

class TwentySeven {
	public static void main(String args[]) {
		Account obj = new Account(65.5);
	}
}
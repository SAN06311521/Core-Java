class Ten{
	public static void main(String args[]){
		//Compund interest calculation
		double principle = 1000.0;
		double rate = 5.0;
		double m = (1 +(rate/100));
		int time = 10;
		double temp = 1;
		for(int i = 1; i <= time;i++){
			temp = temp*m;
		}
		double amount = principle*temp;
		System.out.println("Amount = " + amount);
		double compoundInterest = amount - principle;
		System.out.println("Compound Interest = " + compoundInterest);
	}
}
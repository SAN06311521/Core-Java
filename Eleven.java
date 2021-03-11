class Eleven{
	public static void main(String args[]){
		//Compund interest calculation
		double principle = 1000.0;
		for(double j = 5.0; j <= 10.0; j++){
			System.out.print("Interest rate is: " + j);
			System.out.println(" ");
			double rate = j;
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
}
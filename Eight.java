class Eight
{
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1; i <= 15; i+=2){
			    System.out.println(i);
				product = product * i;
		}
		
			System.out.println("Product is: " + product);
	}
}
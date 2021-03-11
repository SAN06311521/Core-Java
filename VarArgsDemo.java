class VarargsDemo {
	public static void main(String args[]) {
		VarargsDemo obj = new VarargsDemo();

		//can pass any number of arguements as shown 
		int num = obj.sumNum(2, 4);
		int num1 = obj.sumNum(3, 5, 7);
		int num2 = obj.sumNum(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
		System.out.println("Summation are: " + num + " " + num1 + " " + num2);		
	}

	public int sumNum(int ... args) {
		System.out.println("Length of the arguments: " + args.length);
		int sum = 0;
		for(int i: args) {
			sum += i;
		}
		return sum;
	}
}
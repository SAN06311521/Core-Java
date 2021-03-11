class withoutLoop{
	public static void main(String args[]){
		Print p1 = new Print();
		p1.result(100);
	}
}

class Print{
	static void result(int n){
		if(n > 0){
			result(n - 1);
			System.out.print(n + " ");
		}
	}	
}
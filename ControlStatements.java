class ControlStatements{
	public static void main(String args[]){
		SelectionStatements obj1 = new SelectionStatements();
		obj1.finalMarks(95);
		obj1.category('a');	
		
		IterationStatements obj2 = new IterationStatements();
		obj2.whileLoop();
		obj2.doWhileLoop();
		obj2.forLoop(5);
		obj2.forEachLoop();

		JumpStatements obj3 = new JumpStatements();
		obj3.continueStatement(4);
		obj3.breakStatement(6); 	
	}
}

class SelectionStatements{
	int marks;
	void finalMarks(int m){
		int marks = m;
		if(m >= 85){
			System.out.println("You scored amazing!");
		}else if(m < 85 && m >= 50){
			System.out.println("Your score is good!");
		}else{
			System.out.println("Try harder!");
		}
	}

	void category(char category){
		switch(category){
			case 'A':
				case 'a':
					System.out.println("congratulations! You scored A grade");
					break;
			case 'B':
				case 'b':
					System.out.println("Well done! You scored B grade");
					break;
			case 'C':
				case 'c':
					System.out.println("Try hard! Your grade is C");
					break;
			default:
				System.out.println("Incorrect category! Try again :)");
				break;
		}
	}
}

class IterationStatements {
	void whileLoop(){
		System.out.println("using while loop- ");
		int i = 0;
		while(i <= 5){
			System.out.print(i + " ");
			i++;
		}
		System.out.println(" ");
	}

	void doWhileLoop(){
		System.out.println(" ");
		System.out.println("using do-while loop: (printing first ten natural number with zero)");
		int i = 0;
		do{
			System.out.print(i + "  ");
			i++;
		}while(i <= 10);
		System.out.println(" ");
	}

	void forLoop(int n) {
		System.out.println(" ");
		System.out.println("Printing patterns via for loop: ");
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	void forEachLoop() {
		System.out.println(" ");
		System.out.println("Printing an array by for-each loop: ");
		int[] array = {6,15,31,21};
		for(int i: array){
			System.out.print(i + "  ");
		}
		System.out.println(" ");
	}
}

class JumpStatements {
	void continueStatement(int n) {
		System.out.println(" ");
		for(int i = 0; i <= 10; i++){
			if(i == n){
				continue;
			}
			System.out.print(i + "  ");
		}
		System.out.println("- Result of continue statement");
	}

	void breakStatement(int n) {
		System.out.println(" ");
		for(int i = 0; i <= 10; i++){
			if(i == n){
				break;
			}
			System.out.print(i + "  ");
		}
		System.out.println("- Result of break statement");
	}
}


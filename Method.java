class Method {
	public static void main(String args[]){
		energyEfficiency('A');
		System.out.println(energyEfficiencyByReturnString('b'));
		carDescription("Cross Polo", 2020, "Excellent");		
	}

	static void energyEfficiency(char category){
		switch(category){
			case 'A':
				case 'a':
					System.out.println("very low");
					break;
			case 'B':
				case 'b':
					System.out.println("low");
					break;
			case 'C':
				case 'c':
					System.out.println("normal");
					break;
			case 'D':
				case 'd':
					System.out.println("above normal");
					break;
			case 'E':
				case 'e':
					System.out.println("high");
					break;
			case 'F':
				case 'f':
					System.out.println("very high");
					break;
			case 'G':
				case 'g':
					System.out.println("extremely high");
					break;
			default:
				System.out.println("Incorrect category! Try again :)");
				break;
		}
	}

	static void carDescription(String model, int productionYear, String condition){
		System.out.println("Description of the car: ");
		System.out.println("model: " + model);
		System.out.println("Production Year: " + productionYear);
		System.out.println("condition: " + condition);
	}


// we can also use return statement as String
// we don't need break because return already ends the statement.


	static String energyEfficiencyByReturnString(char category) {
		switch(category){
			case 'A':
				case 'a':
					return "very low";
			case 'B':
				case 'b':
					return "low";
			case 'C':
				case 'c':
					return "normal";
			case 'D':
				case 'd':
					return "above normal";
			case 'E':
				case 'e':
					return "high";
			case 'F':
				case 'f':
					return "very high";
			case 'G':
				case 'g':
					return "extremely high";
			default:
				return "Incorrect category! Try again :)";
		}
	}
}
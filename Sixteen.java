class Sixteen {
	public static void main(String args[]){
		String str1 = "First string";
		String str2 = "Second string";
		String str3 = "First string";
		if(str1.equals(str2)){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		if(str1.equals(str3)){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		String str4 = "FOUR";
		String str5 = "Four";
		if(str4.equalsIgnoreCase(str5)){
			System.out.println("str4 == str5");
		}else{
			System.out.println("str4 != str5");
		}
	}
}
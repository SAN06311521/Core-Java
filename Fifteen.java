import java.util.Scanner;

class Fifteen{
	public static void main(String args[]){
		String str1 = "First string";
		String str2 = "Second string";
		String str3 = "First string";
		if(str1.equals(str2)){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}

		// length() method use to find length of characters in str1
		System.out.println("length method: ");
		System.out.println("Length of first string is: " + str1.length());

		//use of charAt()method to find character at an iindex.
		System.out.println("charAt method: ");
		System.out.println("Character at thirs index of string 3 is: " + str3.charAt(3));
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.println("Entered character is: " + ch);
		if(str1.equals(str3)){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		String str4 = "FOUR";
		String str5 = "Five";
		if(str4.equalsIgnoreCase(str5)){
			System.out.println("str4 == str5");
		}else{
			System.out.println("str4 != str5");
		}
		System.out.println("Comparison of string 1 and string 2 is: " + str1.compareTo(str2));
		System.out.println("Comparison of string 4 and string 5 is: " + str4.compareToIgnoreCase(str5));
		System.out.println("Index of O in str4 is: " + str4.indexOf('O'));
		String str = "July 5, 2012 1:28:19pm";

		//use of indexOf() method to find index of a particular character.
		System.out.println("IndexOf method: ");
		System.out.println("index of J: " + str.indexOf('J'));	
		System.out.println("index of 2: " + str.indexOf('2'));	
		System.out.println("index of 2 after ninth position: " + str.indexOf('2',9));	
		System.out.println("index of 2(last): " + str.lastIndexOf('2'));

		//use of substring() method to find a part of string in str1
		System.out.println("Substring method: ");
		System.out.println("Substring of str1: " + str1.substring(6,11));
		
		// use of concat() method
		System.out.println("concat method: ");	
		System.out.println("Concatenation of str4 and str5: " + str4.concat(str5));
		
		System.out.println("Replace str5 by four: " + str5.replace('F', 'f'));
		System.out.println("str to upper case: " + str.toUpperCase());
		System.out.println("str to lower case: " + str.toLowerCase());	
		System.out.println("Is str1 empty? ans: " + str.isEmpty());
		String str6 = "                    hey!! I've extra space! Remove                  ";
		System.out.println("Trim string 6: " + str6.trim());					
	}
}
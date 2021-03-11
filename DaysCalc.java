import java.util.Scanner;
class DaysCalc {
public static void main(String[] args) {
System.out.println("Enter Month:");
Scanner input = new Scanner(System.in);
String month = input.nextLine();
int days = 31;
String Month = month.toLowerCase();
if (Month.equals("january"))
days = 31;
else if (Month.equals("february"))
days = 28;
else if (Month.equals("march"))
days = 31;
else if (Month.equals("april"))
days = 30;
else if (Month.equals("may"))
days = 31;
else if (Month.equals("june"))
days = 30;
else if (Month.equals("july"))
days = 31;
else if (Month.equals("august"))
days = 31;
else if (Month.equals("september"))
days = 30;
else if (Month.equals("october"))
days = 31;
else if (Month.equals("november"))
days = 30;
else if (Month.equals("december"))
days = 31;
else {
System.out.println("Please enter month correctly!");
return;
}
System.out.println("Number of days in " + month + ":" + days);
}
}
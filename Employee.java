import java.util.*;
class Employee{
String first_name;
String last_name;
double salary;
double yearlySalary;
double yearlySalaryAfterRaise;
Scanner sc = new Scanner(System.in);
Employee(){
System.out.println("Enter first name of the employee");
first_name = sc.nextLine();
System.out.println("Enter last name of the employee");
last_name = sc.nextLine();
System.out.println("Enter salary of the employee");
salary = sc.nextDouble();
}
void getFirstName(String first_name){
System.out.println("First name: "+first_name);
}
void getLastName(String last_name){
System.out.println("Last name: "+last_name);
}
void getSalary(double salary){
System.out.println("Salary: "+salary);
}
void getYearlySalary(double salary){
yearlySalary = salary*12;
System.out.println("Yearly Salary: "+yearlySalary);
}
void getYearlySalaryAfterRaise(double salary){
yearlySalaryAfterRaise = (salary+salary*0.1)*12;
System.out.println("Yearly salary after 10% raise: "+yearlySalaryAfterRaise);
}
}
class EmployeeTest
{
public static void main(String args[])
{
Employee emp1 = new Employee();
emp1.getFirstName(emp1.first_name);
emp1.getLastName(emp1.last_name);
emp1.getSalary(emp1.salary);
emp1.getYearlySalary(emp1.salary);
emp1.getYearlySalaryAfterRaise(emp1.salary);
Employee emp2 = new Employee();
emp2.getFirstName(emp2.first_name);
emp2.getLastName(emp2.last_name);
emp2.getSalary(emp2.salary);
emp2.getYearlySalary(emp2.salary);
emp1.getYearlySalaryAfterRaise(emp2.salary);
}
}
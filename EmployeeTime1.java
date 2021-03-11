class Employee {
private String firstName;
private String lastName;
public String getFirstName() {
return firstName;
}
public String getLastName() {
return lastName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
}
class ContractEmployee extends Employee {
String depart;
String desig;
double salary;
public void setDepartment(String depart) {
this.depart = depart;
}
public void setDesignation(String desig) {
this.desig = desig;
}
public void setSalary(double salary) {
this.salary = salary;
}
public String getDepartment() {
return depart;
}
public String getDesignation() {
return desig;
}
public double getSalary() {
return salary;
}
public void dispFullName() {
System.out.println(getFirstName() + getLastName());
}
}
class RegularEmployee extends Employee {
String depart;
String desig;
double salary;
public void setDepartment(String depart) {
this.depart = depart;
}
public void setDesignation(String desig) {
this.desig = desig;
}
public void setSalary(double salary) {
this.salary = salary;
}
public String getDepartment() {
return depart;
}
public String getDesignation() {
return desig;
}
public double getSalary() {
return salary;
}
public void dispFullName() {
System.out.print(getFirstName() + " " + getLastName());
}
}
class EmployeeTime1 {
public static void main(String args[]) {
ContractEmployee Ct = new ContractEmployee();
Ct.setFirstName("John");
Ct.setLastName("Wick");
Ct.setDepartment("Sales");
Ct.setDesignation("Manager");
Ct.setSalary(1500000);
String f_name = Ct.getFirstName();
String l_name = Ct.getLastName();
String dep = Ct.getDepartment();
String desig = Ct.getDesignation();
double sal = Ct.getSalary();
System.out.println("First Name : " + f_name);
System.out.println("Last Name : " + l_name);
System.out.println("Department : " + dep);
System.out.println("Designation : " + desig);
System.out.println("Salary : " + sal);
Ct.dispFullName();
RegularEmployee Rg = new RegularEmployee();
Rg.setFirstName("Mark");
Rg.setLastName("Louis");
Rg.setDepartment("Marketing");
Rg.setDesignation("superwiser");
Rg.setSalary(1200000);
f_name = Rg.getFirstName();
l_name = Rg.getLastName();
dep = Rg.getDepartment();
desig = Rg.getDesignation();
sal = Rg.getSalary();
System.out.println("First Name : " + f_name);
System.out.println("Last Name : " + l_name);
System.out.println("Department : " + dep);
System.out.println("Designation : " + desig);
System.out.println("Salary : " + sal);
Rg.dispFullName();
}
}
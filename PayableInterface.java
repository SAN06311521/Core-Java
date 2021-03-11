interface Payable
{
double getAmount();
}
class Employee implements Payable
{
String fname;
String lname;
double sal;
void setData(String fname,String lname,double sal)
{
this.fname=fname;
this.lname=lname;
this.sal=sal;
}
public double getAmount()
{
return sal;
}
void show()
{
System.out.println("Name: "+fname+" "+lname);
}
}
class PayableInterface
{
public static void main(String args[])
{
Employee e=new Employee();
e.setData("Sam","John",123214.432);
double sal=e.getAmount();
e.show();
System.out.println("Salary : "+sal);
}
}
import java.util.Scanner;
class Account {
String name;
double balance;
Scanner sc = new Scanner(System.in);
public Account(double b) {
if (b > 0.0)
this.balance = b;
else
System.out.println("enter valid amount");
}
public void credit(double a) {
if (a > 0.0){
balance += a;
System.out.println("amount deposited " + a);
}
else
System.out.println("enter valid amount");
}
public double getBalance() {
return balance;
}
public void debit(double d) {
if (d > 0.0 && d < balance) {
balance -= d;
System.out.println("amount withdrawn " + d);
System.out.println("your remaining amount " + balance);
} else if (d < 0.0) {
System.out.println("enter valid amount");
} else {
System.out.println("debit ammount exceeded balance amount");
}
}
}
class AccountTest {
public static void main(String[] args) {
Account a1 = new Account(20000.0);
System.out.println("Balance in the account: "+a1.getBalance());
a1.credit(2000.0);
System.out.println("current balance is " + a1.balance);
a1.debit(4000.0);
double curBal = a1.getBalance();
System.out.println("current balance is " + curBal);
}
}
3.
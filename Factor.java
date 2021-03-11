import java.util.Scanner;

public class Factor {

  public static void main(String[] args) {

    // positive number

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scan.nextInt();

    System.out.print("Factors of " + n + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= n; ++i) {

      // if number is divided by i
      // i is the factor
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
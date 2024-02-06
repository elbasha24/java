import java.util.Scanner;

public class jv2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer:");
    int num = scanner.nextInt();
    System.out.println("You entered: " + num);

    System.out.println("Enter a double:");
    double dbl = scanner.nextDouble();
    System.out.println("You entered: " + dbl);

    System.out.println("Enter a string:");
    String str = scanner.next();
    System.out.println("You entered: " + str);

    scanner.close();
  }
}


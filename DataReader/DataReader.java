import java.io.*;
import java.util.Scanner;

public class DataReader {
  public static void doThings(String filename) throws FileNotFoundException {
    Scanner input = new Scanner(new File(filename));
    int nume;
    String operator;
    double denom;
    while (input.hasNextLine()) {
      nume = input.nextInt();
      operator = input.next();
      denom = input.nextDouble();
      if (operator.equals("+")) {
        System.out.println(nume + denom);
      }
      if (operator.equals("-")) {
        System.out.println(nume - denom);
      }
      if (operator.equals("*")) {
        System.out.println(nume * denom);
      }
      if (operator.equals("/")) {
        System.out.println(nume / denom);
      }
    }
  }

  public static void main(String[] args) {
    String filename = "data.txt";
    try {
      doThings(filename);
    } catch (FileNotFoundException e) {
      System.out.println("File \"" + filename + "\" not found.");
      System.exit(1);
    }
  }
}

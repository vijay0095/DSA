import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // t time no. want to check//
    int t = scn.nextInt();
    for (int times = 0; times < t; times++) {

      //for input no.//
      int n = scn.nextInt();
      int factor = 0;

      for (int i = 2; i * i <=n; i++) {
        if (n % i == 0) {
          factor++;
          break;
        }
      }
      if (factor == 0) {
        System.out.println("prime");
      }
      else {
        System.out.println("not prime");
      }
    }
  }
}
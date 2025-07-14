package FourthLecture;

import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("All even numbers till n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of n");
        long n = sc.nextLong(); // changed to nextLong for consistency with 'long' type
        System.out.println("You have entered: " + n);

      for (long i = 1; i <= n; i++) {
     if (i % 2 == 0) {
        System.out.print(i + " ");
    }
}
        System.out.println(); // prints newline after the loop
        sc.close();
    }                                                 
}

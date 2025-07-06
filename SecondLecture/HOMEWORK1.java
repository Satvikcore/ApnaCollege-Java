package SecondLecture;
import java.util.*;
public class HOMEWORK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Radius: " + radius);

        // Use Math.PI for a more accurate value of pi
        double area = Math.PI * radius * radius;



        // Print area up to 2 decimal places
        System.out.printf("Area: %.2f\n", area); //"Area: %.2f\n - **this is something new please learn this.**
        sc.close();
    }
}

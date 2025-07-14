package FourthLecture;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter 1 to input marks or 0 to exit: ");
            number = sc.nextInt();

            // Force re-entry if the input is not 1 or 0
            while (number != 1 && number != 0) {
                System.out.println("Invalid choice! Please enter only 1 or 0.");
                System.out.print("Try again: ");
                number = sc.nextInt();
            }
             if (number == 1) {
                System.out.print("Enter the marks (0-100): ");
                int marks = sc.nextInt();
                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks < 60) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don't matter but our effort does.");
                } else {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            }
        } while (number != 0);
        System.out.println("Program ended. Keep showing up with effort—that's what counts!");
        sc.close();
    }
}
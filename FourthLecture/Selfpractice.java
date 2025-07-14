package FourthLecture;

import java.util.*;

public class Selfpractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Effort Tracker Programme");
        int button;

        do {
            System.out.println("Press 1 to give input or 0 to exit");
            button = sc.nextInt();

            // Re-prompt if the user enters something other than 1 or 0
            while (button != 1 && button != 0) {
                System.out.println("Invalid input. Please press 1 to give input or 0 to exit.");
                button = sc.nextInt();  // Read again
            }

            if (button == 1) {
                System.out.println("Enter the number of hours you studied today");
                int hours = sc.nextInt();

                if (hours >= 8) {
                    System.out.println("Exceptional Dedication");
                } else if (hours >= 5) {
                    System.out.println("Great Consistency");
                } else if (hours >= 2) {
                    System.out.println("A decent push");
                } else if (hours >= 0) {
                    System.out.println("Let's aim for better tomorrow");
                } else {
                    System.out.println("Invalid hours");
                }
            }

        } while (button != 0);

        System.out.println("Programme Finished");
        sc.close();
    }
}

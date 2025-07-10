package ThirdLecture;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose 2 numbers a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Choose operation 1,2,3,4 or 5\n1 : + (Addition) a + b\n" + //
                "2 : - (Subtraction) a - b\n" + //
                "3 : * (Multiplication) a * b\n" + //
                "4 : / (Division) a / b\n" + //
                "5 : % (Modulo or remainder) a % b");
    int operation = sc.nextInt();
    switch(operation) {
            case 1 : System.out.println("Result: " + (a + b));
            break;
            case 2 : System.out.println("Result: " + (a - b));
            break; 
            case 3 : System.out.println("Result: " + (a * b));
            break;
            case 4 : 
                if (b != 0) {
                    System.out.println("Result: " + ((double)a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }

            break;
            case 5 : System.out.println("Result: " + (a % b));
            break;
            default : System.out.println("invalid");
    }
    sc.close();
}
}
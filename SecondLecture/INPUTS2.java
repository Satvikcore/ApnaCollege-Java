package SecondLecture;

import java.util.*;

public class INPUTS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Length: " + length + ".");

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        System.out.println("Breadth: " + breadth + ".");

        int area = length * breadth;
        System.out.println("Area: " + area + "!");
        sc.close();
    }
}

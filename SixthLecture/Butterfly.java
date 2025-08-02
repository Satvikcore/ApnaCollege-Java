package SixthLecture;

import java.util.*;

public class Butterfly {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("BUTTERFLY");
    System.out.println("Input value of m");
    int m=sc.nextInt();
    for(int i=1; i<=m; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        int spaces = 2*(m-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=m; i>=1; i--) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        int spaces = 2*(m-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    

    
}
}
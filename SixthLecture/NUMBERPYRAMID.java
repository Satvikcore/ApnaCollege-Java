package SixthLecture;

import java.util.*;

public class NUMBERPYRAMID {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("BUTTERFLY");
    System.out.println("Input value of m");
    int m=sc.nextInt();
    for(int i=1; i<=m; i++) {
        for(int j=1; j<=m-i; j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print(i + " ");
        }
            System.out.println();

    sc.close();
}
}
}
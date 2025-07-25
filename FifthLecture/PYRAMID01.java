package FifthLecture;

import java.util.*;

public class PYRAMID01 {
    public static void main(String args[]) {
    System.out.println("HALF PYRAMID WITH 0,1 PATTERN");
    Scanner sc= new Scanner(System.in);
    System.out.println("INPUT THE NUMBER OF ROWS");
    int m = sc.nextInt();
    for(int i=1; i<=m; i++) {
        for(int j=1; j<=i; j++) {
            int number = i+j;
        if(number % 2 == 0) {
            System.out.print("1"+ " ");
        }else{
        System.out.print("0"+ " ");
        }
            }
            System.out.println();
        }
        System.out.println();
        sc.close();
    }
    }
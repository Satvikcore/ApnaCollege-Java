package SixthLecture;

import java.util.Scanner;

public class PALINDROMIC {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("PALENDROMIC TRIANGLE");
    System.out.println("Input the Number of rows");
    int m=sc.nextInt();
    for(int i =1; i<=m; i++) {
        for(int j=1; j<=m-i; j++) {
    System.out.print("  ");

        }
        for(int j=i; j>=1; j--) {
        System.out.print(j + " ");
        }
        for(int j=2; j<=i; j++) {
        System.out.print(j+" ");
        }

    System.out.println();
}
sc.close();
}
}
//System.out.println("");
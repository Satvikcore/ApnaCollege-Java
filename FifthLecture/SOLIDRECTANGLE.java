package FifthLecture;

import java.util.*;

public class SOLIDRECTANGLE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the number of rows");
        int m = sc.nextInt();
        System.out.println("Choose the number of columns");
        int n = sc.nextInt();
    for(int i=1; i<=m; i++) {
        for(int j=1; j<=n; j++) {
            System.out.print("*");
        } System.out.println();
        }
        sc.close();
    }
}

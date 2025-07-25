package FifthLecture;

import java.util.*;

public class INVERTEDNUMBERSHALFPYRAMID {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INVERTED HALF PYRAMID WITH NUMBERS");
        System.out.println("Tell the number of rows");
        int m= sc.nextInt();
        for(int i=m; i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    sc.close();
    }
}

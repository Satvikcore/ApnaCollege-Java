package FifthLecture; 

import java.util.*;

public class HALFPYRAMID {
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Choose the number of rows");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++) {
            for(int j=1 ; j<=i; j++) {
                System.out.print("*");
}
System.out.println("");
}
sc.close();
}
}

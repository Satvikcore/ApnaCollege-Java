package FifthLecture;

import java.util.*;

public class FLOYD {
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("FLOYD's TRIANGLE");
    System.out.println("Choose the number of rows");
    int m = sc.nextInt();
    int number=1;
    for(int i=1; i<=m; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print(number+" "); 
            number++; 
}
System.out.println();
}
sc.close();
}
}
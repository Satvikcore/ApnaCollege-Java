package FourthLecture;

import java.util.*;

public class P1 {
    public static void main(String[] args){
        System.out.println("Sum of First n Natural Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of n");
        long n = sc.nextInt();
            System.out.println("You have entered: " + n);
            long sum = 0;
        for(long i = 0; i<=n; i ++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}

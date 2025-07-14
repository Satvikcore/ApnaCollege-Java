package FourthLecture;

import java.util.*;

public class P2 {
    public static void main(String[] args){
        System.out.println("Table of a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the value of number");
        long n = sc.nextInt();
            System.out.println("You have entered: " + n);
            long product = n;
        for(long i = 1; i<11; i ++) {
            product = n * i;
            System.out.println(product);
        }
        sc.close();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
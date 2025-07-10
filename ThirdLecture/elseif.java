package ThirdLecture;

import java.util.*;

public class elseif{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Type two numbers A and B");

    int a = sc.nextInt();
    System.out.println("A is " + a);
    int b = sc.nextInt();
    System.out.println("B is " + b);
    if( a == b ) {
        System.out.println("A equal to be");
    } else if( a > b ) {
        System.out.println(" A is greater than B");
    } else {
        System.out.println("A is less than B ");
    }
    sc.close();
    }
}
package ThirdLecture;

import java.util.*;

public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();
        if(age >=18) {
            System.out.println("You are an adult");

        } else {
            System.out.println("You are a minor");
            sc.close();
        }
    } 
}

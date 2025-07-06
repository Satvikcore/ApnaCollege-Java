package SecondLecture;

import java.util.*; //importing from java.util.* ( this is where a lot of code is written)

public class INPUTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // System.out.println("Hi");
        //String name = sc.next();
        // only first word is printed if sc.next is used
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
        //nextInt()
        //nextFloat()
        //nextDouble()
    }
}


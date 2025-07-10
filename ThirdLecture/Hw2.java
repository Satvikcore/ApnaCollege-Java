package ThirdLecture;

import java.util.*;

public class Hw2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of the month");
    int month = sc.nextInt();
    switch(month){
case 1 : System.out.println("Month name:January");
break;

case 2 : System.out.println("Month name:February");
break;

case 3 : System.out.println("Month name:March");
break;

case 4 : System.out.println("Month name:April");
break;

case 5 : System.out.println("Month name:May");
break;

case 6 : System.out.println("Month name:June");
 break;

case 7 : System.out.println("Month name:July");
break;

case 8 : System.out.println("Month name:August");
break;

case 9 : System.out.println("Month name:September");
break;

case 10 : System.out.println("Month name:October");
break;
case 11 : System.out.println("Month name:November");
break;
case 12 : System.out.println("Month name:December");
break;
default : System.out.println("Invalid");
    }
sc.close();
}
}
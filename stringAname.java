package classAndObject;

import java.util.Scanner;
public class stringAname {
    public static void main(String[] args) {
        stringName cs = new stringName();
        cs.getdata();
        cs.putdata();

    }
}
class stringName {
    String name;
    int roll_no;
   void getdata(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name");
       name = sc.nextLine();
       System.out.println("Enter the roll number");
       roll_no = sc.nextInt();
   }
   void putdata(){
       System.out.println("Name is : "+ name + "  Roll no is : "+ roll_no);
   }
}
// Add two number using the clas and object

package classAndObject;
import java.util.Scanner;
public class addTwoNumber {
    public static void main(String[] args) {
     add sum = new add();
     sum.getdata();
     sum.putdata();
    }
}
class add{
    int a,b;
    void getdata(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
    }
    void putdata(){
        System.out.println("Sum is : "+ (a+b));
    }
}

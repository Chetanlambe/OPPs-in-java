// Calculate the area of the triangle using the class and object

package classAndObject;
import java.util.Scanner;
import java.lang.Math;
public class areaOfTriangle {
    public static void main(String[] args) {
       triangle d = new triangle();
       d.area();
    }
}
class triangle{
    void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side");
        double a = sc.nextInt();
        System.out.println("Enter the second side");
        double b = sc.nextInt();
        System.out.println("Enter the third side");
        double c = sc.nextInt();

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is : "+ area);
    }
}

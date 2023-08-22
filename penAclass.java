//show the color and type of the pen using the class and object

package classAndObject;
public class penAclass {
    String color;
    String type;
    void write(){
        System.out.println("writing something");
    }
    void printcolor(){
        System.out.println(this.color);
    }
}
class pens{
    public static void main(String[] args) {
        penAclass pen1 = new penAclass();
        pen1.color ="blue";
        pen1.type ="gel";

        pen1.write();
        pen1.printcolor();

        penAclass pen2 = new penAclass();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen2.write();
        pen2.printcolor();

    }

}

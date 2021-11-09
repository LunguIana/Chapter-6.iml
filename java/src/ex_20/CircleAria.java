package ex_20;
import java.util.Scanner;
class CircleAria {
    double CircleArea(double radius) {
        return (Math.PI * radius * radius);
    }
    public static void main(String[] args) {
        CircleAria ob = new CircleAria();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        double r = Sc.nextDouble();
        double area = ob.CircleArea(r);
        System.out.println("The area of the circle is: " + area);

    }
}
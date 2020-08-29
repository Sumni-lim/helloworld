import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  formula of areaofcircle A=(pi)r2 ,where r=radius

        System.out.println("enter the redius ");
        double r = in.nextDouble();
        double area = Math.PI * (r * r);
        System.out.println("the area of circle is=" + area);
    }
}

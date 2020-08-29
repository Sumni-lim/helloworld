import java.util.Scanner;
public class CircumferenceOfCircle {
    public static void main(String[] args) {
         /*formula:c=pi*d=2*pi*r
        where,
      c  is the circleference of the circle of redius
      d is the diameter of the  circle
      pi is a constant which is denoted as (pi) and its value is 3.14159 26535 89793
        */
        Scanner in=new Scanner(System.in);
        System.out.println("ente the redius");
        double r=in.nextDouble();
        double circumference=Math.PI *2*r;
        System.out.println("The circumference of the circle is :"+circumference);
    }
}


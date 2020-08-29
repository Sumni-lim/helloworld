import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
        //formula:A=s^2
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        int length = in.nextInt();
        int area = length * length;
        System.out.println("area of square=" + area);
    }

}


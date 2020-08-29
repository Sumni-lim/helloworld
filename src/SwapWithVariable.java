import java.util.Scanner;
public class SwapWithVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1 and num2");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Before swapping num1="+num1 + " and num2=" + num2);
        int num3=num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After swapping num1=" + num1 + " and num2=" + num2);
    }
    }




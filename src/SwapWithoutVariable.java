import java.util.Scanner;
public class SwapWithoutVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1 and num2");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Before swapping num1=" + num1 + "and num2=" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping num1=" + num1 + "and num2=" + num2);
    }
}


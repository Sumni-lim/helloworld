import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the roll number ");
        int roll=in.nextInt();
        switch(roll) {
            case 1:
                System.out.println("Student Name:Suhana");
                break;
            case 2:
                System.out.println("Student Name:Sohan");
                break;
            case 3:
                System.out.println("Student name:Rohan");
                break;
            case 4:
                System.out.println("Student name:Siera ");
                break;
            case 5:
                System.out.println("Student name:Ranbir");
                break;
            case 6:
                System.out.println("Student name:Saradh");
                break;
            case 7:
                System.out.println("Student name:Aahana");
                break;
            default:
                System.out.println("Not found");
        }
    }
}

import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        //condition:The remainder of "year/4"should be equal to zero for a leap year.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=in.nextInt();
        if(year%4==0) {
            System.out.println(year + "is leap year");
        }
        else{
            System.out.println(year+"is not leap year");
        }
    }
    }


import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter N number of element"+"for finding avarage:");
        final int count=in.nextInt();;
        System.out.println("");
        double [] numbers=new double [count];
        double sum=0;
        for(int i=0;i<count;i++){
            System.out.println("enter numbers"+(i+1)+":");
            numbers[i]=in.nextDouble();
            sum+=numbers[i];
        }
        double avg=sum/count;
        System.out.println("");
        System.out.println("Average of the given numbers is"+avg);
    }

}

public class SwitchCase {
    public static void main(String[] args) {
        //char grade arg[0] charAt[0];
        char grade='c';
        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Welldone");
                break;
            case 'C':
                System.out.println("Nice");
                break;
            case 'D':
                System.out.println("just passed");
                break;
            case 'E':
                System.out.println("Better try angain");
                break;
            default:
                System.out.println("invalid grade");
        }
        System.out.println("your grade is"+grade);
        }
    }



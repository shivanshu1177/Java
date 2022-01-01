import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //first no.
        System.out.println("Enter 1: ");
        int a = sc.nextInt();
        //second no.
        System.out.println("Enter 2: ");
        int b = sc.nextInt();

        System.out.println("Operator: ");

        char s = sc.next().charAt(0);

        switch (s) {
            case '+':
                System.out.println(a+b);
                
                break;

            case '-':
                System.out.println(a-b);
                
                break;

            case '/':
                System.out.println(a/b);
                
                break;

            case '*':
                System.out.println(a*b);
                
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }

    }
}

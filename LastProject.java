package newprogram;
import java.util.Scanner;
public class LastProject {
    public static void main(String [] args) {
        double a,b;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("Enter the operator (+,-,/,*)");
        char op=sc.next().charAt(0);
        double result=0;
        switch(op) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '/':
                result=a/b;
                break;
            case '*':
                result=a*b;
                break;
            default:
            	System.out.println("entered wrong input");
            	break;
        }
        System.out.println("Final result is :");
        System.out.println(a+" "+op+" "+b+"=" + result);
    }
}




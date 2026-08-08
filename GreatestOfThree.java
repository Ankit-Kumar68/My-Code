package geekForGeeks;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sb.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sb.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sb.nextInt();

        if(a>b && a>c) System.out.print(a);
        if(b>a && b>c) System.out.print(b);
        if(c>a && c>b) System.out.print(c);

            
        
    }

    
}

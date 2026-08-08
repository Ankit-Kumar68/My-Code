package geekForGeeks;
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sb.nextInt();
        if(n >= 0) System.out.println(n);
        else System.out.println(-n);
    }
    
}

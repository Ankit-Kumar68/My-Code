package geekForGeeks;
import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        if(n%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
    
}

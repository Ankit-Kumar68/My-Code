package geekForGeeks;
import java.util.Scanner;

public class ternaryInvariable {
    public static void min(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        int arya;
        if(n>=0) arya = 100;
        else arya = 0;

        System.out.println(arya);
    }
}

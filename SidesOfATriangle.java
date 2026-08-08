package geekForGeeks;

import java.util.Scanner;



public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sb.nextInt();
        System.out.print("Enter 2nd side: ");
        int b = sb.nextInt();
        System.out.print("Enter 3rd side: ");
        int c = sb.nextInt();

        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
        
        



    }
    
}

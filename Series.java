package geekForGeeks;
import java.util.Scanner;

public class Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 99 ,d = 4;
        for(int i=1;i>=0;i++){
            System.out.print(a+" ");
            a += d;

        } 

    }
    
}

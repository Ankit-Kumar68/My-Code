import java.util.Scanner;
public class SumOfOddNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 3; i <= n; i += 3){
            sum = sum + i;
        }
        System.out.println("Sum Odd number = " +sum);
    }
}
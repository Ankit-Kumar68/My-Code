import java.util.Scanner;
public class ArmStrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int rem;

        for(; num > 0; num = num / 10){
            rem = num % 10;
            sum = sum + (rem * rem * rem);
        }
        if(sum == original){
            System.out.println(original +"is an ArmStrong number.");
        } else {
            System.out.println(original +" is an Not ArmStrong number.");
        }
    }
}
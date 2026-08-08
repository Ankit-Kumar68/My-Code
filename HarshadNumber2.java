import java.util.Scanner;
public class HarshadNumber2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;


        while(temp > 0){
            int digit = num % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if(num % sum == 0){
            System.out.println(num + "is a Harshad number.");
        } else {
            System.out.println(num + "is a not harshad number.");
        }
    }
}
import java.util.Scanner;
public class FirstAndLastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;

        for(; firstDigit >= 10; firstDigit =firstDigit / 10){
        }
        System.out.println("first digit =" +firstDigit);
        System.out.println("last digit =" +lastDigit);

    }
}
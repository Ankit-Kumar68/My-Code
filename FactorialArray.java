import java.util.Scanner;
public class FactorialArray {
    public static long Factorial(int n){
        long fact = 1;
        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Factorial of array Elements:");
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i] +"=" +Factorial (arr[i]));
        }
    }
}

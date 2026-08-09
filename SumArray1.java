import java.util.Scanner;
public class SumArray1 {
    public static int SumArray(int[] arr){
        int sum = 0;
        for(int i = 0; i <arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int result = SumArray(arr);
        System.out.println("Sum of array Elements =" +result);
    }
}

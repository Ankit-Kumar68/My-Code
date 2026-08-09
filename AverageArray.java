import java.util.Scanner;
public class AverageArray {
    public static double average(int arr[]){
        int sum = 0;
        for(int i = 0; i <arr.length; i++){
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        double avg = average(arr);
        System.out.println("Average =" + avg);
    }
}

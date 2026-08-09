import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallestArray {
    // Method to find the second smallest element
    public static int findSecondSmallest(int arr[]){
        Arrays.sort(arr);
        // Array ko ascending order me sort karega
        return arr[1];
        // Second Smallest Element
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("Array must contain at least 2 Element.");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("second smallest element =" +secondSmallest);
    }
}

import java.util.Scanner;
public class SecondLargestArray1 {
    public static void secondLargest(int arr[]){
        int largest = arr[0];
        int secondLargest = arr[0];
        // Find Largest Element
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        // Find secondLargest Element
        secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < largest);
            secondLargest = arr[i];
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("second Largest Element not Found.");
        } else {
            System.out.println("second Largest Element =" +secondLargest);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        secondLargest(arr);
    }
}

import java.util.Scanner;
public class BinarySarechArray {
    public static int binarySearch(int arr[], int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                return mid;
            } else if(arr[mid] < key){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array Elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        if(result != -1){
            System.out.println("Enter found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

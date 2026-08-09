import java.util.Scanner;
public class RotateSortedArraySearchArray1 {
    public static int search(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low +(high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            // left half sorted
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int target = 0;
        int index = search(arr, target);
        if(index != -1){
            System.out.println("Element Found At Index =" +index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}

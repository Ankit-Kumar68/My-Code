import java.util.Scanner;
public class SelectionSortArray {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    // Print Method
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {20, 10, 50, 30, 40};
        System.out.println("Before Sorting:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}

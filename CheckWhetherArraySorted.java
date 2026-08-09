import java.util.Scanner;`
public class CheckWhetherArraySorted {
    public static void checksorted(int arr[]){
        boolean sorted = true;
        for(int i = 0; i <arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
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
        checksorted(arr);
    }
}

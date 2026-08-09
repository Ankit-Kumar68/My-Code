import java.util.Scanner;
public class CopyOneArrayToAnotherElements {
    public static void copyArray(int arr[], int copy[]){
        for(int i = 0; i <arr.length; i++){
            copy[i] = arr[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        System.out.println("Enter the array Elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // method call
        copyArray(arr, copy);
        System.out.println("Copied Array:");
        for(int i = 0; i <arr.length; i++){
            System.out.print(copy[i] +" ");
        }
    }
}

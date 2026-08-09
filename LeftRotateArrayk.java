import java.util.Scanner;
public class LeftRotateArrayk {
    public static void leftrotatearray(int arr[], int k){
        int n = arr.length;
        k = k % n;
        for(int j = 0; j < k; j++){
            int first = arr[0];
            for(int i = 0; i <arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }
    }
    // method print array
    public static void printArray(int arr[]){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        leftrotatearray(arr,k);
        printArray(arr);
    }
}

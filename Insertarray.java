import java.util.Scanner;
public class Insertarray {
    public static int[] insertElement(int arr[], int n, int pos, int value){
        for(int i = n; i > pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        return arr;
    }
    // method print array
    public static void printArray(int arr[], int n){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter the array Element:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position( 0 to " + n + "): ");
        int pos = sc.nextInt();
        System.out.println("Enter value to insert: ");
        int value = sc.nextInt();
        insertElement(arr,n,pos,value);
        System.out.println("Array after insertion:");
        printArray(arr,n + 1);
    }
}

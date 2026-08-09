import java.util.Scanner;
public class LeftArray {
    public static void leftrotate(int arr[]){
        int first = arr[0];
        for(int i = 0; i <arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
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
        leftrotate(arr);
        System.out.println("Enter after left rotation:");
        for(int i = 0; i <arr.length; i++){
           System.out.print(arr[i]+" ");
        }
    }
}

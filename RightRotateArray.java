import java.util.Scanner;
public class RightRotateArray {
    public static void rotateArray(int arr[]){
        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
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
        rotateArray(arr);
        System.out.println("Enter the after rotate array:");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}

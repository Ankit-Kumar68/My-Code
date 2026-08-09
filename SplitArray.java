import java.util.Scanner;
public class SplitArray {
    public static void splitArray(int arr[]){
        int mid = arr.length / 2;
        System.out.println("First part:");
        for(int i = 0; i < mid; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Second part:");
        for(int i = mid; i <arr.length; i++){
            System.out.print(arr[i]+" ");
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
        splitArray(arr);
    }
}

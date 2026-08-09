import java.util.Scanner;
public class SortDescendingArray {
    public static void sortDescending(int arr[]){
        int temp;
        for(int i = 0; i <arr.length - 1; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in Descending Order:");
        for(int i = 0; i <arr.length; i++){
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
        sortDescending(arr);
    }
}

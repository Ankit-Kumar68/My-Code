import java.util.Scanner;
public class KthSmallestElementArray {
    public static void kthsmallest(int arr[], int k){
        int n = arr.length;
        // Sort Array in Ascending Order
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(k >= 1 && k <= n){
            System.out.println(k +"th Smallest Element =" +arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
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
        System.out.print("Value of k: ");
        int k = sc.nextInt();
        kthsmallest(arr,k);
    }
}

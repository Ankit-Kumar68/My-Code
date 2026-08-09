import java.util.Scanner;
public class FirstLargestElementArray {
    public static int findLargest(int arr[]){
        // Find Largest Element
        int largest = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
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
        int largest = findLargest(arr);
        System.out.println("Largest element =" +largest);
    }
}

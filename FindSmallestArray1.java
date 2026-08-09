import java.util.Scanner;
public class FindSmallestArray1 {
    public static int SmallestElement(int arr[]){
        // Find Smallest Element
        int smallest = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i] < smallest){
                System.out.print(arr[i] +" ");
            }
        }
        return smallest;
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
        int result = SmallestElement(arr);
        System.out.println("Smallest Element =" +result);
    }
}

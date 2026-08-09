import java.util.Scanner;
public class ElementExistsArray1 {
    public static boolean exitsElement(int arr[], int key){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
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
        System.out.println("Enter search Element:");
        int key = sc.nextInt();
        if(exitsElement(arr, key)){
            System.out.println("Element Exit in Array:");
        } else {
            System.out.println("Element does not Exit in Array:");
        }
    }
}

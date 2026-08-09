import java.util.Scanner;
public class DeleteArrayElement1 {
    public static int deleteElement(int arr[], int n, int value){
        int index = -1;
        //find the Element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                index = i;
                break;
            }
        }
        // Element not found
        if(index == -1){
            System.out.println("Element not found. ");
            return arr.length;
        }
        // shift Element to the left
        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        return arr.length -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element to delete: ");
        int value = sc.nextInt();
        n = deleteElement(arr,n,value);
        System.out.println("Array after deletion:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

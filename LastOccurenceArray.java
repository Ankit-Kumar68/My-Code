import java.util.Scanner;
public class LastOccurenceArray {
    public static int Lastoccurence(int arr[], int key){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array of elements:");
        for(int i =0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search the elements:");
        int key = sc.nextInt();
        int index = Lastoccurence(arr,key);
        if(index != -1){
            System.out.println("Last occurence found at index: "+index);
        } else {
            System.out.println("Element not found index");
        }
    }
}

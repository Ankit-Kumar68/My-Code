import java.util.Scanner;
public class FirstOccurence1 {
    public static int firstoccurence(int arr[], int key){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                System.out.print(arr[i]+" ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search Element:");
        int key = sc.nextInt();
        int index = firstoccurence(arr,key);
        if(index != -1){
            System.out.println("Element array at index" +index);
        } else {
            System.out.println("Element array not found index:");
        }
    }
}

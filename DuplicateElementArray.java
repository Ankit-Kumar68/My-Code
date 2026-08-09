import java.util.Scanner;
public class DuplicateElementArray {
    public static void findDuplicate(int arr[]){
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No Duplicate element");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate Elements:");
        findDuplicate(arr);
    }
}

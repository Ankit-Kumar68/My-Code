import java.util.Scanner;
public class UniqueArray {
    public static void findunique(int arr[]){
        for(int i = 0; i <arr.length; i++){
            int count = 0;
            for(int j = 0; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique Elements:");
        findunique(arr);
    }
}

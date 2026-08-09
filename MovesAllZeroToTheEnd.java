import java.util.Scanner;
public class MovesAllZeroToTheEnd {
    public static void moveAllZero(int arr[]){
        int index = 0;
        // Non zero Element ko aage rakho
        for(int i = 0; i <arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        // Bachi Hui Position Me 0 Bhar Do
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        System.out.println("Array after moving zeros to end:");
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
        moveAllZero(arr);
    }
}

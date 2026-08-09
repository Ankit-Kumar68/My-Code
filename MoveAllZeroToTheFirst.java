import java.util.Scanner;
public class MoveAllZeroToTheFirst {
    public static void moveFirstZero(int arr[]){
        int temp[] = new int[arr.length];
        int index = 0;
        // pahale sabhi zero store karo
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == 0){
                temp[index] = arr[i];
                index++;
            }
        }
        // phir non zero elements store karo
        for(int i = 0; i <arr.length; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }
        // Result print karo
        System.out.println("Array after moving zeros to first:");
        for(int i = 0; i <arr.length; i++){
            System.out.println(temp[i]+" ");
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
        moveFirstZero(arr);
    }
}

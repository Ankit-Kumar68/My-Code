import java.util.Scanner;
public class EvenCountDigits {
    public static int counteven(int arr[]){
        int count = 0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int evencount = counteven(arr);
        System.out.println("Total even number =" +evencount);
    }
}

import java.util.Scanner;
public class WaveArray {
    public static void converttoWave(int arr[]){
        for(int i = 0; i <arr.length - 1; i+= 2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter array elements:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        converttoWave(arr);
        System.out.println("Wave Array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

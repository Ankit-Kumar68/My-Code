import java.util.Scanner;
public class CountPositiveNegativeZero {
    public static void positivenegativezero(int arr[]){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > 0){
                positive++;
            } else if(arr[i] < 0){
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive number =" +positive);
        System.out.println("Negative number =" +negative);
        System.out.println("Zero number =" +zero);
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
        positivenegativezero(arr);
    }
}

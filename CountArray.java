import java.util.Scanner;
public class CountArray {
    public static void countDigits(int arr[]){
        for(int i = 0; i <arr.length; i++){
            int num = arr[i];
            int count = 0;
            if(num == 0){
                count = 1;
            } else {
                num = Math.abs(num);
                while(num > 0){
                    count++;
                    num = num / 10;
                }
            }
            System.out.println(arr[i] + "->" + count +"digits");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        countDigits(arr);
    }
}

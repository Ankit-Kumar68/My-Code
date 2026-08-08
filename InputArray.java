import java.util.Scanner;
public class InputArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //input using loop
        System.out.println("Enter the 5 elements: ");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
}
import java.util.Scanner;
public class AllUniqueElementArray {
    public static void FindUnique(int arr[]){
        System.out.println("Unique Element are:");
        for(int i = 0; i <arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 60};
        FindUnique(arr);
    }
}

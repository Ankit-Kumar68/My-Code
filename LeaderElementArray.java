import java.util.Scanner;
public class LeaderElementArray {
    public static void findLeader(int arr[]){
        int maxFromRight = arr[arr.length - 1];
        System.out.print("Leaders: ");
        System.out.print(maxFromRight+" ");
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                System.out.print(maxFromRight+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeader(arr);
    }
}

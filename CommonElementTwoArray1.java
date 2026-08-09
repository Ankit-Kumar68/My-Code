import java.util.Scanner;
public class CommonElementTwoArray1 {
    public static void findCommonElement(int arr1[], int arr2[]){
        System.out.println("Common Element are:");
        for(int i = 0; i <arr1.length; i++){
            for(int j = 0; j <arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};
        findCommonElement(arr1, arr2);
    }
}

import java.util.Scanner;
public class UnionOfTwoArray {
    public static void findUnion(int arr1[], int arr2[]){
        System.out.println("Union Element are:");
        for(int i = 0; i <arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        // print only unique elements from second array
        for(int i = 0; i <arr2.length; i++){
            boolean isPresent = false;
            for(int j = 0; j <arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent){
                System.out.print(arr2[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 50, 60, 70};
        findUnion(arr1, arr2);
    }
}

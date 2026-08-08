public class PositiveElement {
    public static void main(String[] args){
        int[] arr = {2,4,5,8,-1,-9,5};
        System.out.println("Enter the positive element: ");
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > 0){
                System.out.print(arr[i]);
            }
        }
    }
}

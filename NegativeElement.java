public class NegativeElement {
    public static void main(String[] args){
        int[] arr = {2,3,-1,4,-8};
        System.out.println("Negative elements are: ");
        for(int i = 0; i <arr.length; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
    }
}

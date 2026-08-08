public class ProductArray {
    public static void main(String[] args){
        int[] arr = {-6,8,14,-2,23,47,-7};
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}

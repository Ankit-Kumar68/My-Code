public class ProductTwoNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 10;
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            for(int j = 1 * i; j <arr.length; j++){
                if(arr[i] * arr[j] == target){
                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Not found product");
        }
    }
}

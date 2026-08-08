public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 7;
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair: "+ arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No Pair found");
        }
    }
}

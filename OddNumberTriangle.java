public class OddNumberTriangle {
    public static void main(String[] args){
        int rows = 4;
        for(int i=1;i<=rows;i++){
            int oddNum = 1;
            for(int j=1;j<=i;j++){
                System.out.print(oddNum + " ");
                oddNum += 2;
            }
            System.out.println();
        }
    }
    
}

import java.util.Scanner;
public class BestTimeToBuySellStockArray {
    public static int maxProfit(int arr[]){
        int minPrice = arr[0];
        int maxProfit = 0;
        for(int i = 1; i <arr.length; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            int Profit = arr[i] - minPrice;
            if(Profit > maxProfit){
                maxProfit = Profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit =" +maxProfit(arr));
    }
}

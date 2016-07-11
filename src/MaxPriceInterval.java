/**
 * Created by ADMINIBM on 7/8/2016.
 */
public class MaxPriceInterval {
    MaxPriceInterval(){}

    public int maxProfit(int[] prices){
        int price_interval = 0;
        int min_value = prices[0];
        for (int i=1; i<prices.length; i++){
            if (prices[i] < min_value){
                min_value = prices[i];
            }else if (prices[i] > min_value + price_interval){
                price_interval = prices[i] - min_value;
            }
        }
        return price_interval;
    }

    public static void main(String args[]){
        int[] input = {7, 1, 5, 3, 6, 4};
        MaxPriceInterval mpi = new MaxPriceInterval();
        System.out.println("" + mpi.maxProfit(input));
    }
}

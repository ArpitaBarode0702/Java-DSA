public class Buy_ellStock {
    public static void main(String[] args) {
        int arr[]={7,1,4,5,6};
        System.out.println(bestTimeToBuyAndSellStock(arr));
        
    }
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>maxprofit){
                maxprofit=prices[i]-min;
            }
        }
        return maxprofit;
    }
    
}

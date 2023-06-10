public class BuyAndSellStock {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int profit=0;
        int buyingPrice=arr[0];
        //bp=1
        for(int i=1;i<arr.length;i++)
        {
            if(buyingPrice>arr[i])
            {
                buyingPrice=arr[i];
            }
            else{
                //2
                profit=profit+(arr[i]-buyingPrice);
                buyingPrice=Integer.MAX_VALUE;
            }
        }
        System.out.println("MAX Profit is : "+profit);
    }
}

package co.rajat.day4_class.leetcode;

public class StockSellingII {
//122
    public static void main(String[] args){
        int arr[] ={7,1,5,3,6,4};
        System.err.println(getGetBestProfit(arr));
    }
    private  static int getGetBestProfit(int [] rr){

        int profit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=1;i<rr.length;i++){
            // int temp=rr[i];
            if( rr[i]>rr[i-1] ){
               profit += rr[i]-rr[i-1];
            }


        }
        return profit;
    }
}

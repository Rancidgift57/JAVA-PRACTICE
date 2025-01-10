public class prac32{
    public static void main(String[] args){
        prac32 obj = new prac32();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(obj.stockandsell(arr));

    }

    public int stockandsell(int[] arr){
        if(arr == null || arr.length < 2){
            return 0;
        }
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : arr){
            minprice = Math.min(minprice,price);
            maxprofit = Math.max(maxprofit,price - minprice); 
        }
        return maxprofit;
    }
}
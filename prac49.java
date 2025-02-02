public class prac49{
    public static void main(String[] args){
        prac49 obj = new prac49();
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(obj.kadane(arr));
    }

    public int kadane(int[] arr){
        int MaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0;i < arr.length;i++){
            currentSum = currentSum + arr[i];
            MaxSum = Math.max(MaxSum,currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return MaxSum;
    }
}
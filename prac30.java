public class prac30{
    public static void main(String[] args){
        prac30 obj = new prac30();
        int[] arr = {3, 3, 4, 2, 3, 3, 1, 3};
        System.out.println(obj.majority(arr));
    }

    public int countele(int[] arr,int target){
        int count = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == target){
                count = count + 1;
            }
        }
        return count;
    }    

    public int majority(int[] arr){
        int k = arr.length/2;
        for(int j = 0;j < arr.length;j++){
            int p = countele(arr,arr[j]);
            if(p > k){
                return arr[j];
            }
        }
        return arr[k];
    }
}
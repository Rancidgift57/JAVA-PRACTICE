import java.util.Arrays;
public class prac25{
    public static void main(String[] args){
        prac25 obj = new prac25();
        int[] arr = {5,6,7,2,1,3};
        int target = 9;
        int[] res = obj.twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }

    public int[] twoSum(int[] arr,int target){
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }            
        }
        return null;
    }
}
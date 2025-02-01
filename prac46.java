import java.lang.reflect.Array;
import java.util.Arrays;

public class prac46 {
    public static void main(String[] args){
        prac46 obj = new prac46();
        int[] nums = {1,2,1,3,2,5};
        int[] result = obj.singleNumber(nums);
        System.out.println(Arrays.toString(result));
    }
    
    public int[] singleNumber(int[] nums) {
        for(int j = 0;j < nums.length;j++){
            if(count(nums,nums[j]) == 1){
                return new int[]{nums[j]};
            }
        }
        return null;
    }

    public int count(int[] arr,int target){
        int co = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == target){
                co++;
            }
        }
        return co;
    }
}
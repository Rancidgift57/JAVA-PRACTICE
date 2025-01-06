package JAVAPRACTICE;
import java.util.ArrayList;
import java.util.Arrays;
public class prac14{
    public static void main(String[] args){
        prac14 obj = new prac14();
        int[] arr = {1,2,3,4,5,6,9};
        int target = 7;
        int[] a = obj.twoSum(arr,target);
        System.out.println(Arrays.toString(a));

    }
    public int[] twoSum(int[] arr,int target){
        for(int i=0;i < arr.length;i++){
            for(int j =i;i < arr.length ;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
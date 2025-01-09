import java.util.Arrays;
public class prac23{
    public static void main(String[] args){
        prac23 obj = new prac23();
        int[] arr = {78,65,44,32,1};
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int  k = 2;
        
        System.out.println(obj.findKthLargest(arr,k));

    }

    public int findKthLargest(int[] nums, int k) {
        quicksort(nums,0,nums.length-1);
        return nums[k-1];
    }

    public void quicksort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int a = start;
        int b = end;
        int pivot = arr[(start + end) / 2];
        while (a <= b) {
            while (arr[a] > pivot) {
                a++;
            }
            while (arr[b] < pivot) {
                b--;
            }
            if (a <= b) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        quicksort(arr, start, b);
        quicksort(arr, a, end);
    }
    
}
public class prac6{
    public static void main(String[] args){
        prac6 obj = new prac6();
        int[] arr = {23,44,55,1,3,67,89,12};
        int target = 3;
        int yt = obj.binarysearch(arr,target);
        System.out.println(yt);
    }

    public int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;
        while(start =< end){
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
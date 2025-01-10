import java.util.Arrays;
public class prac27{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        prac27 obj = new prac27();
        int n = arr.length;
        int k = 3;
        //obj.swap(arr,0,n-1);
        obj.rotate(arr,k );
        System.out.println(Arrays.toString(arr));

    }

    public void rotate(int[] arr,int k){
        int t = arr.length;
        k = k%t;
        swap(arr, 0, t-1);
        swap(arr, 0, k-1);
        swap(arr,k,t-1);
    }

    public void swap(int[] arr,int i,int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
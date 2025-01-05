package JAVAPRACTICE;
import java.util.Arrays;
public class prac10{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        prac10 obj = new prac10();
        obj.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void quicksort(int[] arr,int low,int high){
        if(low >= high){
            return ;
        }

        int a = low;
        int b = high;
        int m = (low + high)/2;
        int pivot = arr[m];
        while(a <= b){
            while(arr[a] <= pivot){
                a++;
            }
            while(arr[b] >= pivot){
                b--;
            }
            if(a <= b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;b--;
            }

        }
        quicksort(arr,low,b);
        quicksort(arr,a,high);
    }
}
import java.util.Arrays;
public class prac9{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3};
        prac9 obj = new prac9();
        int[]ary = obj.merge(arr);
        System.out.println(Arrays.toString(ary));
    }

    public int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = (arr.length)/2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        return mergesort(left,right);
    }

    public int[] mergesort(int[] first,int[] second){
        int[] mix  = new int[first.length  + second.length];
        int i = 0, j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(i > second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
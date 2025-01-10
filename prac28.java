import java.util.Arrays;
public class prac28{
    public static void main(String[] args){
        prac28 obj = new prac28();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int k = obj.countzero(arr1);
        int p = obj.countzero(arr2);
        int[] res = obj.merge(arr1,k,arr2,arr2.length);

        System.out.println(Arrays.toString(res));

    }

    public int countzero(int[] arr){
        int c = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == 0){
                c = c + 1;
            }
        }
        return c;
    }

    public int[] merge(int[] first,int m,int[] second,int n){
        int[] mix = new int[m + n];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n){
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
        while(i < m){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < n){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
import java.util.Arrays;
public class prac43{
    public static void main(String[] args){
        prac43 obj = new prac43();
        int[] right = {1,2};
        int[] left = {3,4};
        int[] mergedarray = obj.mergesort(right, left);
        int mid = mergedarray.length / 2;
        if(mergedarray.length % 2 == 0){
            System.out.println((mergedarray[mid-1]+mergedarray[mid])/2.0);
        }
        else{
            System.out.println(mergedarray[mid]);
        }
        System.out.print(Arrays.toString(mergedarray));
    }
    public int[] mergesort(int[] right,int[] left){
        return merge(right,left);
    }

    public int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0,j = 0;
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
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
package JAVAPRACTICE;
import java.util.Scanner;
import java.util.Arrays;
public class prac3{
    public static void main(String[] args){
        int[] arr = {5,3,7,1,2,9};
        prac3 obj = new prac3();
        int[] res = obj.sorting(arr);
        System.out.println(Arrays.toString(res));
    }

    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] sorting(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
}
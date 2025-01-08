import java.util.ArrayList;

public class prac21{
    public static void main(String[] args){
        prac21 obj = new prac21();
        int[] arr = {1,2,3,4,5,6};
        obj.reverse(arr);


    }
    public void reverse(int[] arr){
        System.out.println("Original Array:");
        for(int i =0;i < arr.length;i++){    
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse Array:");
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[arr.length-j-1] + " ");
        }
    }
}
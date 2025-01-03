package JAVAPRACTICE;
import java.util.Scanner;
public class prac2{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,7,9};
        prac2 obj = new prac2();
        obj.linearrange(arr,5,1,4);
    }

    public void linearrange(int[] arr,int target,int start,int end){
        boolean found = false;
        for(int i = start;i <= end; i++){
            if(arr[i] == target){
                System.out.println(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("NOT FOUND");
        }
    }
}
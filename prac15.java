package JAVAPRACTICE;
import java.util.Scanner;
public class prac15{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},
                    {5,7,8}};
        prac15 obj = new prac15();
        
        System.out.println(obj.richwealth(arr));

    }

    public int richwealth(int[][] arr){
        int overall = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum >  overall){
                sum = overall;
            }
        }
        return overall;
    }
}
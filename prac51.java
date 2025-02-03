import java.util.ArrayList;
import java.util.Collections;
public class prac51{
    public static void main(String[] args){
        prac51 obj = new prac51();
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(obj.leaders(arr));
    }
    public ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxfromright = arr[n-1];
        result.add(maxfromright); 
        for(int i = n-2;i >= 0 ;i--){
            if(arr[i] >= maxfromright){
                result.add(arr[i]);
                maxfromright = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
import java.util.Arrays;
public class prac29{
    public static void main(String[] args){
        prac29 obj = new prac29();
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        obj.merge(arr1,3,arr2,arr2.length);
        System.out.println(Arrays.toString(arr1));
    }
    
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;
        int j  = n - 1;
        int k = (m + n) - 1;
        while(i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[k--] = num1[i--];
            }
            else{
                num1[k--] = num2[j--];
            }  
        }
        while(j >= 0){
            num1[k--] = num2[j--];
        }
    }
}

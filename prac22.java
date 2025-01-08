import java.util.Arrays;
public class prac22{
    public static void main(String[] args){
        prac22 obj = new prac22();
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        //obj.bubblesort(arr);
        System.out.println(obj.findkthlargest(arr,k));
    }

    public int findkthlargest(int[] arr,int k){
        insert(arr);
        return arr[k-1];
    }

    public void insert(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
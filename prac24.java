import java.util.Arrays;
public class prac24{
    public static void main(String[] args){
        prac24 obj = new prac24();
        int[] arr = {3,0,1};
        int yu = obj.cycle(arr);
        System.out.println(yu);
    }
    public int cycle(int[] arr)
    {
        int i=0;
        while (i < arr.length){
            int in = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[in]){
                int temp = arr[i];
                arr[i] = arr[in];
                arr[in] = temp;
            }
            else{
                i++;
            }
        }
        for(int index=0;index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
}
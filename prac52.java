public class prac52{
    public static void main(String[] args){
        prac52 obj = new prac52();
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(obj.inversionCount(arr));
    }
    public int inversionCount(int arr[]) {
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}
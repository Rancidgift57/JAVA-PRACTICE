public class prac31{
    public static void main(String[] args){
        prac31 obj = new prac31();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        obj.findDuplicate(arr);
    }
    public void findDuplicate(int[] arr){
        for(int i = 1;i< arr.length;i++){
            if(arr[i] == arr[i - 1]){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
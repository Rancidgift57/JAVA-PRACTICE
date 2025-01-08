package JAVAPRACTICE;
public class prac20{
    public static void main(String[] args){
        prac20 obj = new prac20();
        int[] arr ={23,45,67,89,56,78,34};
        System.out.println(obj.maxele(arr));
        System.out.println(obj.minele(arr));
    }
    public int maxele(int[] arr){
        int max = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return arr[max];
    }

    public int minele(int[] arr){
        int min = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return arr[min];
    }
}
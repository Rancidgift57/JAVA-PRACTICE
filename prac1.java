package JAVAPRACTICE;

public class prac1 {
    public static void main(String[] args) {
        prac1 obj = new prac1();
        int[] arr = {5,6,7,8,10};
        obj.linearsearch(arr,7);
    }

    public void linearsearch(int[] arr,int target){
        boolean found = false;
        for(int i=0;i < arr.length;i++){
            if(arr[i] == target){
                System.out.println(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("ELEMENT NOT FOUND");
        }
        
    }
    
}
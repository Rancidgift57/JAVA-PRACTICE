public class prac11{
    public static void main(String[] args){
        prac11 obj = new prac11();
        char[] letters = {'e','f','g','k'};
        char target = 'i';
        System.out.println(obj.nextGreatestLetter(letters,target));
        
    }

    public char nextGreatestLetter(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
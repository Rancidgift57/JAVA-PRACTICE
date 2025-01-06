public class prac13{
    public static void main(String[] args){
        prac13 obj = new prac13();
        int b = 121;
        int c = obj.reverse(b);
        if(b == c){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
    public int reverse(int a){
        int reverse = 0;
        while(a >0){
            int  b = a%10;
            reverse = reverse*10 + b;
            a = a/10;
        }
        return reverse;
    } 
}
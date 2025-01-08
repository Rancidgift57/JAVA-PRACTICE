package JAVAPRACTICE;
public class prac18{
    public static void main(String[] args){
        prac18 obj = new prac18();
        int p = 122;
        System.out.println(obj.palindrome(p));
    }

    public boolean palindrome(int a){
        int original = a;
        int rev = 0;
        while(a > 0){
            int b = a % 10;
            rev = rev*10 + b;
            a = a / 10;
        }
        if(original == rev){
            return true;
        }
        return false;
    }
}
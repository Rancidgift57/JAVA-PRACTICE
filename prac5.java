package JAVAPRACTICE;
public class prac5{
    public static void main(String[] args){
        prac5 obj = new prac5();
        int a = 1000;
        System.out.println(obj.czero(a));

    }

    public int czero(int a){
        int count = 0;
        while(a > 0){
            int b = a % 10;
            if(b == 0){
                count = count + 1;
            }
            a = a / 10;
        }
        return count;
    }
}
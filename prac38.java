public class prac38{
    public static void main(String[] args){
        prac38 obj = new prac38();
        int a = 153;
        System.out.print(obj.armstrong(a));

    }

    public boolean armstrong(int n){
        int sum = 0;
        int original = n;
        while(n > 0){
            int f = n % 10;
            sum = sum + f*f*f;
            n = n/10;
        }
        if(original == sum){
            return true;
        }
        return false;
    }
}
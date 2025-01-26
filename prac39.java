public class prac39{
    public static void main(String[] args){
        long a = 1534236469;
        int sign = a < 0 ? -1 : 1;
        long reverse = 0;
        long c = Math.abs(a);
        while(c > 0){
            long b = c%10;
            reverse = reverse*10 + b;
            c = c/10;
        }
        reverse = reverse * sign;
        System.out.println(reverse);
    }
}
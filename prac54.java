
import java.util.Arrays;
public class prac54{
    public static void main(String[] args){
        prac54 obj = new prac54();
        int a = 4;
        System.out.println(obj.countStrings(a));
    }

    public int countStrings(int n) {
        if(n == 1) return 2;
        if(n == 2) return 3;
        int prev2 = 3,prev1 = 2,current = 0;
        for(int i = 3;i <= n;i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}
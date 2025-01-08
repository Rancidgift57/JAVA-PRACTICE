package JAVAPRACTICE;
public class prac19{
    public static void main(String[] args){
        prac19 obj =new prac19();
        int a = 7;
        obj.fibonacci(a);

    }
    public void fibonacci(int a){
        int firstterm = 0;
        int secondterm = 1;
        System.out.print(firstterm + ",");
        System.out.print(secondterm);
        for(int i=0;i <= a ;i++){
            int thirdterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = thirdterm;
            System.out.print(","+thirdterm);
        }
        
        
    }
}
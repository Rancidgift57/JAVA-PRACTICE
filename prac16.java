package JAVAPRACTICE;
public class prac16{
    public static void main(String[] args){
        prac16 obj = new prac16();
        obj.pat1(5);
        obj.pat2(5);
        obj.pat3(5);
        obj.pat4(5);

    }
    public void pat1(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pat2(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pat3(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
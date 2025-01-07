package JAVAPRACTICE;
public class prac17{
    public static void main(String[] args){
        prac17 obj = new prac17();
        obj.phone("","13");
    }

    public void phone(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i< (digit*3);i++){
            char ch = (char)('a'+ i);
            phone(p+ch,up.substring(1));
        }
    }
}
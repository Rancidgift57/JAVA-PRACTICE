
public class prac44{
    public static void main(String[] args){
        prac44 obj = new prac44();
        String a = "abc";
        String b = "pqr";
        System.out.println(obj.mergestr(a,b));
    }
    public String mergestr(String a,String b){
        StringBuilder c = new StringBuilder();
        int len1 = a.length();
        int len2 = b.length();
        int i = 0,j = 0;
        while(i < len1 && j < len2){
            c.append(a.charAt(i++));
            c.append(b.charAt(j++));
        }
        while(i < len1){
            c.append(a.charAt(i++));
        }
        while(j < len2){
            c.append(b.charAt(j++));
        }
        return c.toString();
    }
}
public class prac35{
    public static void main(String[] args){
        prac35 obj = new prac35();
        String a = "loveleetcode";
        System.out.println(obj.firstUniqChar(a));
    }

    public int countchar(String b,char a){
        int count = 0;
        for(int i = 0;i < b.length();i++){
            if(b.charAt(i) == a){
                count++;
            }
        }
        return count;
    }

    public int firstUniqChar(String s){
        for(int i = 0;i < s.length();i++){
            if(countchar(s, s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
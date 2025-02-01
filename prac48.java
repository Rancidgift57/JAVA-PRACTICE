public class prac48{
    public static void main(String[] args){
        prac48 obj = new prac48();
        int num = 5;
        String bin = Integer.toBinaryString(num);
        String bin1 = obj.flipBinary(bin);
        int cha = Integer.parseInt(bin1,2);
        int dif = num - cha;
        System.out.println(dif);
    }
    public String flipBinary(String a){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < a.length();i++){
            result.append(a.charAt(i) == '1' ? '0' : '1');
        }
        return result.toString();
    }

}
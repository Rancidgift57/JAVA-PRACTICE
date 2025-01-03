package JAVAPRACTICE;
public class prac4{
    public static void main(String[] args){
        prac4 obj = new prac4();
        String name = "nikhil";
        char target = 'k';
        obj.listring(name,target);

    }

    public void listring(String name,char target){
        int length = name.length();
        boolean found = false;
        for(int i=0;i < length;i++){
            if(name.charAt(i) == target){
                System.out.println(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("NOT FOUND");
        }
    }
}
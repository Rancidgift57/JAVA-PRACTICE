package JAVAPRACTICE;
import java.util.Stack;
public class prac12{
    public static void main(String[] args){
        prac12 obj = new prac12();
        String a = "([])";
        boolean yt = obj.isValid(a);
        System.out.println(yt);

    }

    public boolean isValid(String a){
        Stack<Character> str = new Stack<>();
        for(char ch : a.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                str.push(ch);
            }
            else{
                if(ch == ')'){
                    if(str.isEmpty() || str.pop() != ')')
                        return false;
                }
                if(ch == '}'){
                    if(str.isEmpty() || str.pop() != '}')
                        return false;
                }
                if(ch == ']'){
                    if(str.isEmpty() || str.pop() != ']')
                        return false;
                }
            }
        }
        return str.isEmpty();
        }
    }
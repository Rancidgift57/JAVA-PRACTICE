public class prac53 {
    public static void main(String[] args) {
        prac53 obj = new prac53();
        String sentence = "luffy is still joyboy";
        System.out.println(obj.lastword(sentence));
    }

    public int lastword(String sentence) {
        String[] words = sentence.split(" ");
        String ad = words[words.length - 1];
        return ad.length(); 
    }
}

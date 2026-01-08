package String;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "I love Java";

        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

import java.util.*;

public class Stackreverse {

    public static String reversestring(String str) {
        Stack<Character> s = new Stack<>();

        int idx = 0;

        while (idx < str.length()) {
            s.push(Character.valueOf(str.charAt(idx)));
            idx++;
        }

        StringBuilder result = new StringBuilder();

        while (!s.isEmpty()) {
            Character curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String result = reversestring(str);
        System.out.println(result);
    }
}
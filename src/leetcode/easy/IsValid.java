package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {
        final Stack<Character> help = new Stack<>();
        final Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                char topElement = help.empty() ? '#' : help.pop();
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                help.push(c);
            }
        }
        return help.empty();
    }

    public static void main(String[] args) {

    }
}

package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimplePassword {

    static Map<Character, Character> map = new HashMap<>();
    static {
        map.put('a', '2');
        map.put('b','2');
        map.put('c','2');
        map.put('d', '3');
        map.put('e','3');
        map.put('f','3');
        map.put('g', '4');
        map.put('h','4');
        map.put('i','4');
        map.put('j', '5');
        map.put('k','5');
        map.put('l','5');
        map.put('m', '6');
        map.put('n','6');
        map.put('o','6');
        map.put('p', '7');
        map.put('q','7');
        map.put('r','7');
        map.put('s','7');
        map.put('t','8');
        map.put('u','8');
        map.put('v','8');
        map.put('w','9');
        map.put('x','9');
        map.put('y','9');
        map.put('z','9');
    }
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                sb.append(map.get(str.charAt(i)));
            } else if ('A' <= str.charAt(i) && str.charAt(i) <= 'X') {
                char c = (char) (str.charAt(i) + 26 - 1);
                sb.append(c);
            } else if('Z' == str.charAt(i)) {
                sb.append('a');
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}

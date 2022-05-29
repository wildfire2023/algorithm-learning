package nowcoder.course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GenerateParenthesis {

    public static ArrayList<String> generateParenthesis (int n) {
        // 结束条件，一对括号
        ArrayList<String> result = new ArrayList<>();
        generateParenthesis(0, 0, "", result, n);
        return result;
    }

    public static void generateParenthesis (int left, int right, String temp, ArrayList<String> res, int n) {
        if (left == n && right == n) {
            res.add(temp);
            return ;
        }
        if (left < n) {
            generateParenthesis(left + 1, right, temp + "(", res, n);
        }
        if (right < n && left > right) {
            generateParenthesis(left, right + 1, temp + ")", res, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(8));
    }
}

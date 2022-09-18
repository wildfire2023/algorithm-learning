package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            // 排除首尾
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            res.add(new ArrayList<>(row));
        }
        return res;
    }

    public static void main(String[] args) {
        generate(5);
    }
}

package huawei;

import java.util.*;

public class Point24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String source = in.nextLine();
            if (source.indexOf("joker") != -1 || source.indexOf("JOKER") != -1) {
                System.out.println("ERROR");
                continue;
            }

            if (!calculate24(source.split(" "))) {

                System.out.println("NONE");
            }
        }
    }

    public static boolean calculate24(String[] fourNumber) {
        // 输出用
        Map<Integer, String> numCharMap = new HashMap<>();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            if ("J".equals(fourNumber[i])) {
                nums[i] = 11;
                numCharMap.put(11, "J");
            }
            else if ("Q".equals(fourNumber[i])) {
                nums[i] = 12;
                numCharMap.put(12, "Q");
            }
            else if ("K".equals(fourNumber[i])) {
                nums[i] = 13;
                numCharMap.put(13, "K");
            }
            else if ("A".equals(fourNumber[i])) {
                nums[i] = 1;
                numCharMap.put(1, "A");
            } else {
                nums[i] = Integer.parseInt(fourNumber[i]);
                numCharMap.put(Integer.parseInt(fourNumber[i]), fourNumber[i]);
            }
        }

        List<int[]> allPokeCases = getAllPokeCases(nums);
        List<char[]> allOperators = getAllOperators();
        for (int[] allPokeCase : allPokeCases) {
            for (char[] allOperator : allOperators) {
                double result = compute(allPokeCase, allOperator);
                if (result == 24) {
                    printResult(numCharMap, allPokeCase, allOperator);
                    return true;
                }
            }
        }
        return false;
    }


    public static void printResult(Map<Integer, String> numCharMap, int[] pokes, char[] operators) {
        StringBuilder sb = new StringBuilder();
        sb.append(numCharMap.get(pokes[0])).append(operators[0])
                .append(numCharMap.get(pokes[1])).append(operators[1])
                .append(numCharMap.get(pokes[2])).append(operators[2]).append(numCharMap.get(pokes[3]));
        System.out.println(sb);
    }

    /**
     * 四个数字的全排列
     * @param pokes
     * @return
     */
    public static List<int[]> getAllPokeCases(int[] pokes) {
        List<int[]> result = new ArrayList<>();
        int[] temp = new int[pokes.length];
        for (int i = 0; i < pokes.length; i++) {
            temp[0] = pokes[i];
            for (int j = 0; j < pokes.length; j++) {
                if (j == i) continue;
                temp[1] = pokes[j];
                for (int k = 0; k < pokes.length; k++) {
                    if (k == i || k == j) continue;
                    temp[2] = pokes[k];
                    for (int l = 0; l < pokes.length; l++) {
                        if (l == i || l == j || l == k) continue;
                        temp[3] = pokes[l];
                        result.add(Arrays.copyOf(temp, temp.length));
                    }
                }
            }
        }
        return result;
    }

    /**
     * 找出所有操作符的全排列
     * @return
     */
    public static List<char[]> getAllOperators() {
        List<char[]> result = new ArrayList<>();
        char[] operators = new char[]{'+', '-', '*', '/'};
        char[] temp = new char[3];
        for (char operator : operators) {
            temp[0] = operator;
            for (char operator1 : operators) {
                temp[1] = operator1;
                for (char operator2 : operators) {
                    temp[2] = operator2;
                    result.add(Arrays.copyOf(temp, temp.length));
                }
            }
        }
        return result;
    }

    /**
     * 运算的顺序从左到右
     * @param nums
     * @param operators
     * @return
     */
    public static double compute(int[] nums, char[] operators) {
        double num1 = nums[0];
        double num2;
        // 遍历nums
        for (int i = 0; i < 3; i++) {
            num2 = nums[i + 1];
            switch (operators[i]) {
                case '+':
                    num1 += num2;
                    break;
                case '-':
                    num1 -= num2;
                    break;
                case '*':
                    num1 *= num2;
                    break;
                case '/':
                    num1 /= num2;
                    break;
                default:
                    break;
            }
        }
        return num1;
    }


}

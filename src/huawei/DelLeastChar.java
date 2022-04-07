package huawei;

import java.util.Scanner;

public class DelLeastChar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int[] count = new int[26];
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
            // 找出最小的字母
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0 && count[i] < min) {
                    min = count[i];
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (count[str.charAt(i) - 'a'] != min) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }

    }
}

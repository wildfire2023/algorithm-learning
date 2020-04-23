package transfer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Transfer {


    public static void main(String[] args) throws IOException {
        // 读取文件
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Transfer.class.getResourceAsStream("/transfer/data/test_data.txt"), StandardCharsets.UTF_8))) {
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
}

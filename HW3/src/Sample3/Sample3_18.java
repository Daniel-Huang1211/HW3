package Sample3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_18 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入英文字");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String U = str.toUpperCase();
        String L = str.toLowerCase();

        System.out.println("轉換成大寫時為" + U);
        System.out.println("轉換成小寫時為" + L);
    }
}

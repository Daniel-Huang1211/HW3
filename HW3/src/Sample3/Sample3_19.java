package Sample3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入字串");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("請輸入要檢索的字母");

        //String str2 = br.readLine();
        //char ch = str2.charAt(0);

        char ch = br.readLine().charAt(0);

        int num = str1.indexOf(ch);
        if(num != -1){
            System.out.println(str1 + "的第" + (num + 1) + "個字母就是\"" + ch + "\"");
        }else{
            System.out.println(str1 + "中沒有\"" + ch + "\" 這個字母");
        }
    }
}

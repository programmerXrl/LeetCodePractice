package month3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toBinaryString(num);
        int max = 0;
        for(int i=0; i<s.length(); i++){
            int len;
            char ch = s.charAt(i);
            if (ch == '1'){
                len = 1;
                i++;
                while (i < s.length() && s.charAt(i)=='1'){
                    len++;
                    i++;
                }
                max = Math.max(len,max);
            }
        }
        System.out.println(max);
    }

}
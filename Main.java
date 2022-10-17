package 算法题;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i]=scanner.nextLine();
        }
        boolean isLex = true;
        boolean isLen = true;
        for (int i = 1; i < n; i++) {
            if (isLen && !isLengths(strings[i-1],strings[i])){
                isLen=false;
            }
            if (isLex && !isLexicographically(strings[i-1],strings[i])){
                isLex=false;
            }
        }
        if (isLex && isLen){
            System.out.println("both");
        }else if (isLen){
            System.out.println("lengths");
        }else if (isLex){
            System.out.println("Lexicographically");
        }else {
            System.out.println("none");
        }
    }
    public static boolean isLexicographically(String s1 , String s2){
        if (s2.contains(s1)) return true;
        for (int i = 0; i < s1.length(); i++) {
            if (i>=s2.length()) return false;
            if (s1.charAt(i)>s2.charAt(i)) return false;
        }
        return true;
    }
    public static boolean isLengths(String s1 , String s2){
        return s1.length() < s2.length();
    }
}

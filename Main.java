package month3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int grade = 0;
        //密码长度
        if (s.length() <= 4){
            grade = 5;
        }else if (s.length() <= 7){
            grade = 10;
        }else {
            grade = 25;
        }

        //字母
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        int len = 0;//表示数字的长度
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z'){
                flag1 = false;
                flag2 = false;//表示有小写
                continue;
            }
            if (ch>='A' && ch<='Z'){
                flag1 = false;
                flag3 = false;//表示有大写
            }
            if (ch >= '0' && ch <= '9'){
                len++;
            }
        }
        if (flag1){
            grade = grade;
        }else if (flag2==false && flag3 == true){
            grade+=10;
        }else if (flag2==true && flag3==false){
            grade+=10;
        }else if (flag2==false && flag3 == false){
            grade+=20;
        }

        //数字
        if (len==1){
            grade+=10;
        }else if (len>1){
            grade+=20;
        }

        //符号
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if ((ch >='!' && ch<='/') || (ch>= ':' && ch<='@') || (ch>='[' && ch<='`') || (ch>='{' && ch<='~')){
                count++;
            }
        }
        if (count==1){
            grade+=10;
        }else if (count>1){
            grade+=25;
        }
        if (count>0 && len>0 && !flag2 && !flag3){
            grade+=5;
        }else if ((!flag2 && count > 0 && len > 0) || (!flag3 && count > 0 && len > 0)){
            grade+=3;
        }else if (!flag1 && len > 0){
            grade+=2;
        }
        if (grade >= 90){
            System.out.println("VERY_SECURE");
        }else if (grade >= 80){
            System.out.println("SECURE");
        }else if (grade >= 70){
            System.out.println("VERY_STRONG");
        }else if (grade >= 60){
            System.out.println("STRONG");
        }else if (grade >= 50){
            System.out.println("AVERAGE");
        }else if (grade >= 25){
            System.out.println("WEAK");
        }else if (grade >= 0){
            System.out.println("VERY_WEAK");
        }
    }

}
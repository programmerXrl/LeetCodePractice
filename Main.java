package month3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 2; i <=n ; i++) {
            int sum = 1;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0){
                    sum+=j;
                    sum+=i/j;
                }
            }
            if (sum == i){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int year = Integer.parseInt(str.split(" ")[0]);
        int  month = Integer.parseInt(str.split(" ")[1]);
        int day = Integer.parseInt(str.split(" ")[2]);
        int ans = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            //是闰年
            switch (month){
                case 1 : ans = day;break;
                case 2 : ans = 31 + day;break;
                case 3 : ans = 60 + day;break;
                case 4 : ans = 91 + day;break;
                case 5 : ans = 121 + day;break;
                case 6 : ans = 152 + day;break;
                case 7 : ans = 182 + day;break;
                case 8 : ans = 213 + day;break;
                case 9 : ans = 244 + day;break;
                case 10 : ans = 274 + day;break;
                case 11 : ans = 305 + day;break;
                case 12 : ans = 335 + day;break;
            }
        }else {
            switch (month){
                case 1 : ans = day;break;
                case 2 : ans = 31 + day;break;
                case 3 : ans = 59 + day;break;
                case 4 : ans = 90 + day;break;
                case 5 : ans = 120 + day;break;
                case 6 : ans = 151 + day;break;
                case 7 : ans = 181 + day;break;
                case 8 : ans = 212 + day;break;
                case 9 : ans = 243 + day;break;
                case 10 : ans = 273 + day;break;
                case 11 : ans = 304 + day;break;
                case 12 : ans = 334 + day;break;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}

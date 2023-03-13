package month3;

import java.util.HashMap;

public class Day05 {
    public static void main(String[] args) {
        String str = "ayxbx";
        System.out.println(function01(str.toCharArray()));
    }
    static int function01(char[] str){
        if (str==null || str.length==0) return 0;
        int ans = 0;
        int xAll = 0;
        int yAll = 0;
        for(char ch : str){
            if (ch=='x')xAll++;
            if (ch=='y')yAll++;
        }
        int xLeft = str[0] == 'x' ? 1 : 0;
        int yLeft = str[0] == 'y' ? 1 : 0;
        for (int i = 1; i <str.length ; i++) {
            if (xLeft == yLeft || xAll-xLeft == yAll-yLeft){
                ans++;
            }
            xLeft += str[i] == 'x' ? 1 : 0;
            yLeft += str[i] == 'y' ? 1 : 0;
        }
        return ans;
    }
    static HashMap<Integer,Integer> fdp = new HashMap<>();
    static int fib(int n){
        if (fdp.containsKey(n)){
            return fdp.get(n);
        }
        int ans = 0;
        if (n == 1){
            ans = 1;
        }else if (n == 2){
            ans = 1;
        }else {
            ans = fib(n-1) + fib(n-2);
        }
        fdp.put(n,ans);
        return ans;
    }
    public int superpalindromesInRange(String left, String right) {
        long l = Long.valueOf(left);//左边界
        long r = Long.valueOf(right);//右边界
        long limit = (long) Math.sqrt((double) r);//右边界开方
        int cnt = 0;//超级回文数
        long seed = 1;//种子,可以从1开始便利
        long enlarge = 0;//得到的回文数
        do {
            enlarge = enlarge2(seed);//偶数回文数
            if (isVaild(enlarge * enlarge,l,r)) cnt++;//看看平方后是否是回文数,且是否越界
            enlarge = enlarge1(seed);//奇数回文数
            if (isVaild(enlarge * enlarge,l,r)) cnt++;//同理
            seed++;//种子加一
        } while (enlarge < limit);//当奇数回文数满足条件,就继续进行
        return cnt;
    }
    static boolean isVaild(long ans, long l, long r){
        return isPalindrome(ans) && ans>=l && ans <=r;//判断是否越界
    }
    static boolean isPalindrome(long n){//判断是否回文
        String s = "" + n;
        int l = 0;
        int r = s.length()-1;
        while (l < r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1 != ch2) return false;
            l++;
            r--;
        }
        return true;
    }
    static long enlarge1(long seed){//凑出奇数回文数
       long ans = seed;
       seed/=10;
       while (seed!=0){
           ans = ans * 10 + seed % 10;
           seed/=10;
       }
       return ans;
    }

    static long enlarge2(long seed){//凑出偶数回文数
        long ans = seed;
        while (seed != 0){
            ans = ans * 10 + seed % 10;
            seed/=10;
        }
        return ans;
    }
}

package month3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m+1];
        for (int i = 0; i < m+1; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        arr[n] = 0;
        for (int i = n; i < m; i++) {
            if (arr[i] == Integer.MAX_VALUE){
                //如果当前石板上没有数字,表示到达不了,直接跳过
                continue;
            }
            List<Integer> list = helper(i);
            for(int j : list){
                if (i + j <= m && arr[i+j] == Integer.MAX_VALUE){//如果目标跳板上没有数字
                    arr[i + j] = arr[i] + 1;
                }else if (i + j <=m){
                    //如果目标跳板上有标记
                    //取最小值
                    arr[i + j] = Math.min(arr[i + j],arr[i] + 1);
                }
            }
        }
        if (arr[m]!=Integer.MAX_VALUE){
            //有数字
            System.out.println(arr[m]);
        }else {
            System.out.println(-1);
        }
    }
    static List<Integer> helper(int num){
        //求num约数集的函数
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                list.add(i);
                if (num / i != i){
                    list.add(num / i);
                }
            }
        }
        return list;
    }
}

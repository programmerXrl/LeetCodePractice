package month3;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int a = 0;//大于这个数
            int b = 0;//小于这个数
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]){
                    a++;
                }else if(arr[i] > arr[j]){
                    b++;
                }
            }
            if (a <= b){
                result[i] = 0;
                System.out.println(result[i]);
            }else {
                int[] tar = new int[n-1-b];
                int x = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i]<arr[j]){
                        tar[x] = arr[j];
                        x++;
                    }
                }
                Arrays.sort(tar);
                //System.out.println(Arrays.toString(tar));
                int k = -1;
                while (a > b){
                    k++;
                    a--;
                    b++;
                }
                System.out.println(tar[k]-arr[i]+1);
            }
        }
    }
}
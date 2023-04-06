package month3;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(2);
      for(int i=3; i< 1000; i+=2){
          if (helper(i)){
              arrayList.add(i);
          }
      }
      int min = Integer.MAX_VALUE;
      int a = 0;
      int b = 0;
      for(int i=0; i<arrayList.size(); i++){
          for(int j=0; j<arrayList.size(); j++){
              if (i >= num || j >= num){
                  continue;
              }
              if (arrayList.get(i) + arrayList.get(j) == num){
                  int x = Math.abs(arrayList.get(i) - arrayList.get(j));
                  if (x < min){
                      min = x;
                      a = arrayList.get(i);
                      b = arrayList.get(j);
                  }
              }
          }
      }
      System.out.println(a);
      System.out.println(b);
    }
    static boolean helper(int num){
        //判断是不是素数
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
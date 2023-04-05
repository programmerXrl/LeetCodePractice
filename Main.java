package month3;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       Map<Character,Integer> map = new HashMap<>();
       int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                max=Math.max(max,map.get(ch));
            }else {
                map.put(ch,1);
            }
        }
        Set<Character> set = new TreeSet<>();
        for (int i=0; i<str.length(); i++){
            if (map.get(str.charAt(i))==max){
                set.add(str.charAt(i));
            }
        }
        for (char ch : set){
            System.out.print(ch);
        }
    }
}
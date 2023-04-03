package month3;

import java.util.HashMap;

public class Day12 {
    public static void main(String[] args) {
        Day12 tool = new Day12();
        String s = "pwwkew";
        System.out.println(tool.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        // 0 -> a   1 -> b
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 1;
        int preLen = 1;
        map.put(s.charAt(0),0);
        for (int i = 1; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                preLen = Math.min(preLen+1,i - map.get(ch));
            }else {
                preLen = preLen+1;
            }
            max = Math.max(max,preLen);
            map.put(ch,i);
        }
        return max;
    }

}

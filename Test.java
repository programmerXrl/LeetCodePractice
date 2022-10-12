import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1};
        Test tool = new Test();
        System.out.println(tool.MoreThanHalfNum_Solution(arr));
    }
    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : numbers){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int max = Integer.MIN_VALUE;
        int result = 0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entries){
            if (entry.getValue()>max){
                max=entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}

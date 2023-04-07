package month4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
       String s = "abcde";
       Set<String> set = new HashSet<>();
       for(int j=0; j<s.length(); j++){
           for(int k=j+1; k<=s.length(); k++){
               String str = s.substring(j,k);
               set.add(str);
           }
       }
        System.out.println(set);
        System.out.println(set.size());
    }
}

package month3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        for (String s : arr){
            if (s.charAt(0)!='"' && flag){
                arrayList.add(s);
            }else {
                //遇到了"
                flag = false;
                if (s.charAt(s.length()-1)!='"'){
                    //如果最后一位不是"
                    builder.append(s.substring(0));
                    builder.append(" ");//加一个空格
                }else {
                    //最后一位是"
                    builder.append(s.substring(0,s.length()-1));
                    flag = true;
                    String copy = builder.toString();
                    arrayList.add(copy.substring(1));
                    builder.delete(0,builder.length());
                }
            }
        }
        System.out.println(arrayList.size());
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}

package 比特笔试强训;

import java.util.ArrayList;

public class Day01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(minNumberInRotateArray(arrayList));
    }
    public static int[] reOrderArrayTwo (int[] array) {
        // write code here
        if (array==null || array.length==1){
            return array;
        }
        int left = 0;
        int right = array.length-1;
        while (left<right){
            if (array[left]%2==0 && array[right]%2!=0){
                int tmp = array[left];
                array[left]=array[right];
                array[right]=tmp;
                left++;
                right--;
            }
            if (array[left]%2!=0){
                left++;
            }
            if (array[right]%2==0){
                right--;
            }
        }
        return array;
        //https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
    }
    public static int minNumberInRotateArray(ArrayList<Integer> array) {
       int left = 0;
       int right =array.size()-1;
       while (left<right){
           int mid = left+(right-left)/2;
           if (array.get(mid)>array.get(right)){
               left=mid+1;
           }else if (array.get(mid)<array.get(right)){
               right=mid;
           }else {
               right--;
           }
       }
       return array.get(left);
       //https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/?favorite=xb9nqhhg
    }
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if (row==0 || col==0){
            return false;
        }
        row = 0;
        col = array[0].length-1;
        while (row<array.length && col>=0){
            int cur = array[row][col];
            if (cur<target){
                row++;
            }else if (cur>target){
                col--;
            }else {
                return true;
            }
        }
        return false;
        //https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
    }
}

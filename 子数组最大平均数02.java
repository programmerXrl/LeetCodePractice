package algorithm.September;
//https://leetcode.cn/problems/maximum-average-subarray-i/ 滑动窗口
public class 子数组最大平均数02 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length==1){
            return nums[0]*1.0;
        }
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int max = sum;
        for (int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            if (max<sum){
                max=sum;
            }
        }
        return 1.0*max/k;
    }
}

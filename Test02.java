package Test_2022_10;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        Test02 test02 = new Test02();
        System.out.println(test02.findLengthOfLCIS(arr));
    }
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int slow = 0;
        int maxLength = 1;
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length++;
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                length = 1;
            }
        }
        return maxLength;
    }
}

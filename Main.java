import java.util.Scanner;
class Main{

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int current_answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current_answer < 0) {
                current_answer = 0;
            }
            current_answer = current_answer + nums[i];
            if (current_answer > ans) {
                ans = current_answer;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }

}
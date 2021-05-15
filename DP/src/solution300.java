public class solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            dp[i] = 1;
        }
        int result = 1;
        for (int i = nums.length-1; i > -1; i--) {

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }
}

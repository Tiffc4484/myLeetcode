public class solution34 {

    public int[] searchRange(int[] nums, int target) {

        int first_occurrence = find_target(nums, 0, nums.length-1, target, true);
        if (first_occurrence == -1) {
            return new int[]{-1,-1};
        }
        int last_occurrence = find_target(nums, 0, nums.length-1, target, false);
        return new int[] {first_occurrence, last_occurrence};
    }

    public int find_target(int[] nums, int left, int right, int target,boolean isFirst) {

        int first;
        int last;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == left || nums[mid-1] != target) {
                        return mid;

                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (mid == right || nums[mid + 1] != target) {
                        return mid;
                    } else {
                        left = mid + 1;
                    }
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

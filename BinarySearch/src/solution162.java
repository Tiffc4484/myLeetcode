public class solution162 {
    public int findPeakElement(int[] nums) {

        int l = nums.length - 1;

        for(int i = 0; i < l; i++)
            if(nums[i] > nums[i + 1])
                return i;

        return l;
    }
}

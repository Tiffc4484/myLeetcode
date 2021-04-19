public class solution33 {
    int[] nums;
    int target;

    public int find_rotate(int left, int right) {
        if (nums[left] < nums[right]) {
            return 0;
        }
        while ( left <= right) {
            int mid = (left + right) / 2;
            if (this.nums[mid] > this.nums[mid+1]) {
                return mid+1;
            } else {
                if (this.nums[mid] < this.nums[left]) {

                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    }

    public int binarySearch(int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else {
                if ( target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        int n = nums.length;
        if (n == 1) {
            return this.nums[0] == target ? 0 : -1;
        }

        int rotate = find_rotate(0, n-1);

        if (nums[rotate] == target) {
            return rotate;
        }
        if (rotate == 0) {
            return binarySearch(0, n-1);
        }
        if (target < nums[0]) {
            return binarySearch(rotate, n - 1);
        }
        return binarySearch(0, rotate);

    }
}

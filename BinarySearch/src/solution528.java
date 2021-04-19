public class solution528 {
    private int[] pick;
    private int totalSum;

    public solution528(int[] w) {
        this.pick = new int[w.length];
        int sum = 0;
        for (int i = 0; i < this.pick.length; i++) {
            sum += w[i];
            this.pick[i] = sum;
        }
        this.totalSum = sum;

    }

    public int pickIndex() {
        double target = this.totalSum * Math.random();
        int left = 0;
        int right = this.pick.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target > this.pick[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

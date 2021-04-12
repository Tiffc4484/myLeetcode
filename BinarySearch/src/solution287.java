import java.util.*;

public class solution287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i:nums) {
            if (s.contains(i)) {
                return i;
            } else {
                s.add(i);
            }
        }
        return -1;
    }
}

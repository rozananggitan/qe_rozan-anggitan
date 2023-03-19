import java.util.*;
public class no3test2 {
    public static void findIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Index adalah : " + map.get(complement) + ", " + i);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("Index tidak ditemukan.");
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 11};
        int target = 11;
        findIndices(nums, target);
    }
}

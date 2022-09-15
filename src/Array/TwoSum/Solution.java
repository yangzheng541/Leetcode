package Array.TwoSum;

import java.util.Arrays;
import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashNums = new Hashtable<>();
        for (int i=0;i<nums.length;i++) {
            if (hashNums.containsKey(target - nums[i])) {
                return new int[]{i, hashNums.get(target - nums[i])};
            }
            if (nums[i] < target) {
                hashNums.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}

package p97leetcode;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            
            int n = nums[i];
            
            int o = target - n;
            
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == o) {
                    return new int[] {i, j};
                }
            }
            
        }
        
        return null;
    }
}

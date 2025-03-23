class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for( int i : nums) {
            total += i;
        }
        int left_total = 0;
        int right_total = 0;
        for(int i = 0; i<nums.length; i++) {
            right_total = total - left_total - nums[i];
            if(left_total == right_total) {
                return i;
            }
            left_total +=nums[i];
        }
        return -1;
    }
}

/*
Time complexity: O(n)
Space complexity: O(1)
*/
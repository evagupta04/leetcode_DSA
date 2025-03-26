class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length-1;
        for(int i = nums.length-1; i>=0; i--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            }
            else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}

/*
TC: O(nlogN)
 for(int i=0; i<nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
-------------------
TC: O(n), space O(n)(because of res array)
*/

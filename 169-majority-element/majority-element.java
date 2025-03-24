class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }
            if(num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}

/*
if an element occurs more than n/2 times in the array (where n is the size of the array), it will always occupy the middle position when the array is sorted
Basic Solution: using sorting, O(nlogn)
Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
-------------------------------
Time complexity: O(n), using Hashmap
int n = (nums.length)/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 0;
-------------------------------------
solution: https://leetcode.com/problems/majority-element/solutions/3676530/3-method-s-beats-100-c-java-python-beginner-friendly/
*/
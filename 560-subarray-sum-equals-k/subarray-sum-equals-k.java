class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0, count =0;
        for(int i=0; i<nums.length; i++) {
            preSum += nums[i];
            if(map.containsKey(preSum-k)) {
                count += map.get(preSum-k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}

/*
Brute Force
TC: O(n^3)
.2
no extra space
int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                int sum = 0;
                for(int m=i; m<=j; m++) {
                    sum += nums[m];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        return count;

TC: O(n^2)
No extra space
    int n = nums.length;
    int count = 0;
    for(int i=0; i<n; i++) {
        int sum = 0;
        for(int j=i; j<n; j++) {
            sum += nums[j];
            if(sum == k) {
                count++;
            }
        }
    }
    return count;
*/
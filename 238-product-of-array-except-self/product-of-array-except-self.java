class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;
        for(int i=1; i<nums.length; i++) {
            left[i] = left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--) {
            right[i] = right[i+1]*nums[i+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}

/*
1) Brute Force
TC: o(n^2)
public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int prod = 1;
            for(int j=0; j<nums.length; j++) {
                if(i == j) {
                    continue;
                }
                prod *= nums[j];
            }
            ans[i] = prod;
       }
       return ans;
    }

2) Divide by the number
TC: o(n)
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        for(int i: nums) {
            prod *= i;
        }
        for(int i=0; i<nums.length; i++) {
            ans[i] = prod/nums[i];
        }
        return nums;
    }
This code will give arithmetic exception because divide by zero

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base condition
        if(nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        //sort the array
        Arrays.sort(nums);
        //use hashset to avoid duplicate elements
        Set<List<Integer>> output = new HashSet<>();
        //fixing the first element as i and find other 2 elements
        for(int i=0; i<nums.length-2; i++) {
            //lfind 2 other elements using two sum(two pointer) approach
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0) {
                    //add the set, move to find other triplets
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(output);
    }
}

/*
TC: O(n^2)
SC: O(n)
Before solving this problem solve two sum problem using TWO POINTER approach,
where we set i as first element of aray and j as last element of array.
This problem is based on Two Sum problem
 Video solution ref: https://www.youtube.com/watch?v=cRBSOz49fQk
*/
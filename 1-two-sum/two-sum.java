class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++) {
            int compliment = target-nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i) {
                return new int[] {i, map.get(compliment)};
            }
            map.put(nums[i], i);
       }
       return new int[] {};
    }
}

/*
double loop with Hashmap
 Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
            int compliment = target-nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i) {
                return new int[] {i, map.get(compliment)};
            }
        }
        return new int[] {};
*/

 /* nested loop
 for(int i=0; i<nums.length; i++) {
            for(int j= i+1; j<nums.length; j++) {
                if(nums[j] == target-nums[i])
                    return new int[] {i,j};
            }
        }
        return new int[] {};*/
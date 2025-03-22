class Solution {
    public int[] plusOne(int[] digits) {
        for(int i= digits.length-1; i>=0; i--) {
            if(digits[i]  + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int newDigits[] = new int[digits.length+1];
        newDigits[0] =1;
        return newDigits;
    }   
}

/**
NOTE: Array is initialized automatically to zero
Note, we have to increment last number, but if incrementing changes large integer,
then we have to change entire array
EX: [2399], [2391], [9], [99], [2389], [999] */
/*
Time complexity: O(n)
Space complexity: O(1)
*/
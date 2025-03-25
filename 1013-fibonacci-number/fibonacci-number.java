class Solution {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for(int i=2; i<=n; i++) {
            int temp = b;
            b = a+b;
            a = temp;;
        }
        return b;
    }
}

/*
link: https://leetcode.com/problems/fibonacci-number/solutions/6032855/0-ms-runtime-beats-100-user-step-by-steps-solution-easy-to-understand/

TC: O(n) may be
*/
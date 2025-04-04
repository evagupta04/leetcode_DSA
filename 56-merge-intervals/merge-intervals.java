class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> output = new ArrayList<>();
        int[] prev = intervals[0];

        for(int i=1; i<intervals.length; i++) {
            int[] current = intervals[i];
            if(prev[1] >= current[0]) {
                prev[1] = Math.max(prev[1], current[1]);
            } 
            else {
                output.add(prev);
                prev = intervals[i];
            }
        }
        output.add(prev);
        return output.toArray(new int[output.size()][]);
    }
}


/*
Time complexity: O(nlogn)
Space complexity: O(n)

Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for(int i=1; i<intervals.length; i++) {
            int[] current = intervals[i];
            if(current[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], current[1]);
            }
            else {
                merged.add(prev);
                prev = current;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);

*/
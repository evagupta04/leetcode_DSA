class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0) {
            if(i>=0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

/*
basic solution O(m+n)  (may ne)
for(int i=m, j=0; j<n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);

Right operation:
int i=m-1, j=n-1, k=m+n-1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        //because if nums1 is empty and nums2 has exact 1 element
        while(i >= 0)
            nums1[k--] = nums1[i--];
        while(j >= 0)
            nums1[k--] = nums2[j--];
    
-----------------------------------
if you want to remove 2 while loops
Right solution, Time complexity: O(m+n)
We are iterating through both arrays once, so the time complexity is O(m+n).

*/
class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
   int lengthM = m-1, lengthN = n-1, total = m+n-1;
    while (lengthM >= 0 && lengthN >=0){
        nums1[total--] = (nums1[lengthM] > nums2[lengthN]) ? nums1[lengthM--] : nums2[lengthN--];
    }
    while (lengthN >= 0){
        nums1[total--] = nums2[lengthN--];
    }
}
}
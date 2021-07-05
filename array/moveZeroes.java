class Solution {
    public void moveZeroes(int[] nums) {
        int i, j, temp = 0;
        for (i= 0, j = 0; i< nums.length && j < nums.length; ++j){
            if (nums[j] != 0) {
                temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
     
        
    }
}
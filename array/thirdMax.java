class Solution {
    public int thirdMax(int[] nums) {
        int first = -1, second = -1, third = -1;
        
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == first || nums[i] == second || nums[i] == third){
                continue;
            }
            if (first == -1 || nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if (second == -1 || nums[i] > second){
                third = second;
                second = nums[i];
            }else if (third == -1 || nums[i] > third){
                third = nums[i];
            }
        }
        
        return third == -1 ? first : third;
    }
}
class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(nums[i] > max) {
                sMax = max;
                max = nums[i];
            } else if(sMax < nums[i]) 
            sMax = nums[i];
        }
        return (max-1) * (sMax-1); 
    }
}
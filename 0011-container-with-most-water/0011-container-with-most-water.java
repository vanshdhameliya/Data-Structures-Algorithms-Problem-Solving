class Solution {

    public int maxArea(int[] height) {
        
      int maxArea = 0;
      int n = height.length - 1;
      int low = 0;
      int high = n;

      while(low < high) {

        int currHeight = Math.min(height[low],height[high]);
        int width = high - low;
        int currArea = currHeight * width;
        maxArea = Math.max(maxArea,currArea);

        if(height[low] <= height[high]) {
            low++;
        } else {
            high--;
        }
      }
      return maxArea;
    }
}
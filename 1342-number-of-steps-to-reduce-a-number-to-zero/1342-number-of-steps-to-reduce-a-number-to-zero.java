class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    public int helper(int n,int stpes) {
        if(n==0) {
            return stpes;
        }

        if(n % 2 == 0 ) {
            return helper(n/2,stpes+1);
        }
        return helper(n-1,stpes+ 1);
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        for (int i = nums.length-2; i>=0; i--) {
            if (n-i<=nums[i]) {
                n=i;
            }
        }
        return n==0;
    }
}

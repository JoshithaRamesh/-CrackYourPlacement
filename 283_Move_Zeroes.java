class Solution {
    public void moveZeroes(int[] nums) {
       int count =0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
            count++;
         }
       }
       int k=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]!=0){
            nums[k] = nums[i];
            k++;
         }
         if(i>=(nums.length-count)){
            nums[i]=0;
         }
       } 
    }
}

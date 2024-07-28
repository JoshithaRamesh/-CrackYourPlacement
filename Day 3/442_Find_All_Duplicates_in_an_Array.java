class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length+1];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i:nums){
            if(arr[i]!=0){
                result.add(i);
            }else{
                arr[i]=i;
            }
        }
        return result;
    }
}

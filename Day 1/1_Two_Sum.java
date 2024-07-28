class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIn = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (numIn.containsKey(com)) {
                return new int[] {numIn.get(com), i};
            }
            numIn.put(nums[i], i);
        }
        return new int[0];
        }
    }

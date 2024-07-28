class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        find(result, new ArrayList<>(), n,1,k);
        return result;
    }
    static void find(List<List<Integer>> result, List<Integer> templist, int n, int start, int k){
        if(templist.size() == k){
            result.add(new ArrayList<>(templist));
            return;
        }else{
            for(int i=start;i<=n;i++){
                templist.add(i);
                find(result, templist, n,i+1, k);
                templist.remove(templist.size()-1);
            }
        }
    }
}

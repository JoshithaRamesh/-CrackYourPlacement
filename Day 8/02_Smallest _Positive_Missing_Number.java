class Solution
{
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int find = 1;
        for(int i=0;i<size;i++){
            if(arr[i] == find){
                find++;
            }
        }
        return find;
    }
}
